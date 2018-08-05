
/*
�ַ�����
FileReader
FileWriter��

BufferedReader
BufferedWriter

�ֽ�����
FileInputStream
FileOutputStream

BufferedInputStream
BufferedOutputStream



ͨ���ղŵļ���¼��һ�����ݲ���ӡ���д��������ʵ���Ƕ�һ�����ݵ�ԭ��
Ҳ����readLine������

�ܲ���ֱ��ʹ��readLine��������ɼ���¼���һ�����ݵĶ�ȡ�أ�


readLine�������ַ���BufferedReader���еķ�����

������¼���read�������ֽ���InputStream�ķ�����

��ô�ܲ��ܽ��ֽ���ת���ַ�����ʹ���ַ�������ȥ��readLine�����أ�


*/
import java.io.*;

class  TransStreamDemo
{
	public static void main(String[] args) throws IOException
	{
		//��ȡ����¼�����
		//InputStream in = System.in;

		//���ֽ�������ת���ַ�������ʹ��ת������InputStreamReader
		//InputStreamReader isr = new InputStreamReader(in);

		//Ϊ�����Ч�ʣ����ַ������л�����������Ч������ʹ��BufferedReader

		//BufferedReader bufr = new BufferedReader(isr);


		//���̵����д����
		BufferedReader bufr = 
				new BufferedReader(new InputStreamReader(System.in));





		
//		OutputStream out = System.out;
//		OutputStreamWriter osw = new OutputStreamWriter(out);
//		BufferedWriter bufw = new BufferedWriter(osw);
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));




		String line = null;

		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
		}

		bufr.close();

	}
}
