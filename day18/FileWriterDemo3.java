/*
��ʾ�������ļ���������д��
*/
import java.io.*;
class  FileWriterDemo3
{
	public static void main(String[] args) throws IOException
	{

		//����һ��true�����������������е��ļ������������ļ���ĩβ������������д��
		FileWriter fw = new FileWriter("demo.txt",true);

		fw.write("nihao\r\nxiexie");

		fw.close();
	}
}
