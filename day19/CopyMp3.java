

/*
��ʾmp3�ĸ��ơ�ͨ����������
BufferedOutputStream
BufferedInputStream


*/
import java.io.*;
class  CopyMp3
{
	public static void main(String[] args) throws IOException
	{
		long start = System.currentTimeMillis();
		copy_2();
		long end = System.currentTimeMillis();

		System.out.println((end-start)+"����");
	}

	public static void copy_2()throws IOException
	{
		MyBufferedInputStream bufis = new MyBufferedInputStream(new FileInputStream("c:\\9.mp3"));
		BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream("c:\\3.mp3"));
		
		int by = 0;

		//System.out.println("��һ���ֽ�:"+bufis.myRead());

		while((by=bufis.myRead())!=-1)
		{
			bufos.write(by);
		}

		bufos.close();
		bufis.myClose();
	}

	//ͨ���ֽ����Ļ�������ɸ��ơ�
	public static void copy_1()throws IOException
	{
		BufferedInputStream bufis = new BufferedInputStream(new FileInputStream("c:\\0.mp3"));
		BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream("c:\\1.mp3"));
		
		int by = 0;

		while((by=bufis.read())!=-1)
		{
			bufos.write(by);
		}

		bufos.close();
		bufis.close();

		
	}
}
