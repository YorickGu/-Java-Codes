
import java.io.*;
import java.net.*;

class  TextClient
{
	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket("192.168.1.254",10006);

		BufferedReader bufr = 
			new BufferedReader(new FileReader("IPDemo.java"));



		PrintWriter out = new PrintWriter(s.getOutputStream(),true);


		String line = null;
		while((line=bufr.readLine())!=null)
		{
			out.println(line);
		}

		s.shutdownOutput();//�رտͻ��˵���������൱�ڸ����м���һ���������-1.

		
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

		String str = bufIn.readLine();
		System.out.println(str);

		bufr.close();

		s.close();
	}
}
class  TextServer
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(10006);

		Socket s = ss.accept();
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"....connected");


		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

		PrintWriter out  = new PrintWriter(new FileWriter("server.txt"),true);

		String line = null;

		while((line=bufIn.readLine())!=null)
		{
			//if("over".equals(line))
				//break;
			out.println(line);
		}

		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		pw.println("�ϴ��ɹ�");


		out.close();
		s.close();
		ss.close();

	}
}
