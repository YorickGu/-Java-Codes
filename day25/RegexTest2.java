/*
��ҳ����(֩��)
*/
import java.io.*;
import java.util.regex.*;
import java.net.*;
import java.util.*;
class RegexTest2 
{
	public static void main(String[] args) throws Exception
	{
		getMails();
		getMails_1();
	}


	public static void getMails_1()throws Exception
	{
		URL url = new URL("https://www.cnblogs.com/pmars/archive/2011/12/30/2307507.html");

		URLConnection conn = url.openConnection();

		BufferedReader bufIn = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String line = null;

		String mailreg = "\\w+@\\w+(\\.\\w+)+";
		Pattern p = Pattern.compile(mailreg);

		

		while((line=bufIn.readLine())!=null)
		{
			Matcher m = p.matcher(line);
			while(m.find())
			{
				System.out.println(m.group());
			}
		}
	}

	/*
	��ȡָ���ĵ��е��ʼ���ַ��
	ʹ�û�ȡ���ܡ�Pattern  Matcher
	*/
	public static void getMails()throws Exception
	{
		BufferedReader bufr = 
			new BufferedReader(new FileReader("mail.txt"));

		String line = null;

		String mailreg = "\\w+@\\w+(\\.\\w+)+";
		Pattern p = Pattern.compile(mailreg);



		while((line=bufr.readLine())!=null)
		{
			Matcher m = p.matcher(line);
			while(m.find())
			{
				System.out.println(m.group());
			}
		}
	}
}
