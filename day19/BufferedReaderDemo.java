
/*
�ַ���ȡ����������
�û������ṩ��һ��һ�ζ�һ�еķ��� readLine�������ڶ��ı����ݵĻ�ȡ��
������nullʱ����ʾ�����ļ�ĩβ��

readLine�������ص�ʱ��ֻ���ػس���֮ǰ���������ݡ��������ػس�����



*/

import java.io.*;

class  BufferedReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		//����һ����ȡ��������ļ��������
		FileReader fr = new FileReader("buf.txt");

		//Ϊ�����Ч�ʡ����뻺�弼�������ַ���ȡ��������Ϊ�������ݸ��������Ĺ��캯����
		BufferedReader bufr = new BufferedReader(fr);
		

		String line = null;

		while((line=bufr.readLine())!=null)
		{
			System.out.print(line);
		}


		bufr.close();
	}

}

