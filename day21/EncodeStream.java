
import java.io.*;

class EncodeStream 
{
	public static void main(String[] args) throws IOException 
	{
			//writeText();
			readText();
	}

	public static void readText()throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(new FileInputStream("utf.txt"),"gbk");

		char[] buf = new char[10];
		int len = isr.read(buf);

		String str = new String(buf,0,len);

		System.out.println(str);

		isr.close();
	}
	public static void writeText()throws IOException 
	{
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf.txt"),"UTF-8");

		osw.write("���");

		osw.close();
	}

}
