/*====��ʮ����==================================
��֪�ļ�a.txt�ļ��е�����Ϊ��bcdeadferwplkou����
���д�����ȡ���ļ����ݣ���������Ȼ˳������������b.txt�ļ��С�
��b.txt�е��ļ�����ӦΪ��abcd��������..��������˳��
*/
import java.io.*;
import java.util.*;
class  Test16
{
	public static void main(String[] args) throws Exception
	{
		/*
		BufferedReader bufr = new BufferedReader(new FileReader("a.txt"));

		String line = bufr.readLine();

		char[] arr = line.toCharArray();

		Arrays.sort(arr);

		BufferedWriter bufw = new BufferedWriter(new FileWriter("b.txt"));

		bufw.write(arr);

		bufw.close();
		bufr.close();
		*/

		writeFile();
	}

	public static void writeFile()throws Exception
	{
		FileReader fr = new FileReader("a.txt");

		CharArrayWriter chw = new CharArrayWriter();

		int ch = 0;

		while((ch=fr.read())!=-1)
		{
			if(ch=='\r' || ch=='\n')
				continue;
			chw.write(ch);
		}

		char[] arr = chw.toCharArray();

		Arrays.sort(arr);

		FileWriter fw = new FileWriter("b.txt");

		fw.write(arr);

		fw.close();
		fw.close();


	}
}
