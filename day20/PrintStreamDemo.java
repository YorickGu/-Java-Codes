
/*
��ӡ����
�����ṩ�˴�ӡ���������Խ������������͵����ݶ�ԭ����ӡ��

�ֽڴ�ӡ����
PrintStream
���캯�����Խ��յĲ������ͣ�
1��file����File
2���ַ���·����String
3���ֽ��������OutputStream



�ַ���ӡ����
PrintWriter
���캯�����Խ��յĲ������ͣ�
1��file����File
2���ַ���·����String
3���ֽ��������OutputStream
4���ַ��������Writer��


*/

import java.io.*;

class  PrintStreamDemo
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bufr = 
			new BufferedReader(new InputStreamReader(System.in));

		PrintWriter out = new PrintWriter(new FileWriter("a.txt"),true);

		String line = null;

		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			out.println(line.toUpperCase());
			//out.flush();
		}

		out.close();
		bufr.close();

	}	
}
