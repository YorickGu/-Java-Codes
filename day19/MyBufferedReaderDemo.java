

/*
������BufferedReader�������з���readLine��ԭ���
�����Զ���һ�����а���һ�����ܺ�readLineһ�µķ�����
��ģ��һ��BufferedReader
*/
import java.io.*;
class MyBufferedReader extends Reader
{
	
	private Reader r;
	MyBufferedReader(Reader r)
	{
		this.r = r;
	}

	//����һ�ζ�һ�����ݵķ�����
	public String myReadLine()throws IOException
	{
		//����һ����ʱ������ԭBufferReader��װ�����ַ����顣
		//Ϊ����ʾ���㡣����һ��StringBuilder��������Ϊ���ջ���Ҫ�����ݱ���ַ�����
		StringBuilder sb = new StringBuilder();
		int ch = 0;
		while((ch=r.read())!=-1)
		{
			if(ch=='\r')
				continue;
			if(ch=='\n')
				return sb.toString();
			else
				sb.append((char)ch);
		}

		if(sb.length()!=0)
			return sb.toString();
		return null;		
	}

	/*
	����Reader���еĳ��󷽷���

	*/
	public int read(char[] cbuf, int off, int len) throws IOException
	{
		return r.read(cbuf,off,len) ;
	}

	public void close()throws IOException
	{
		r.close();
	}
	public void myClose()throws IOException
	{
		r.close();
	}
}


class  MyBufferedReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("buf.txt");

		MyBufferedReader myBuf = new MyBufferedReader(fr);

		String line = null;

		while((line=myBuf.myReadLine())!=null)
		{
			System.out.println(line);
		}

		myBuf.myClose();
	}
}
