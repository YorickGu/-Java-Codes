
/*
��ʾ�ͻ��˺ͷ���ˡ�

1��
�ͻ��ˣ������ (telnet)
����ˣ��Զ��塣

2��
�ͻ��ˣ��������
����ˣ�Tomcat��������

3��
�ͻ��ˣ��Զ��塣(ͼ�ν���)
����ˣ�Tomcat��������



*/

import java.net.*;
import java.io.*;
class ServerDemo 
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(11000);

		Socket s = ss.accept();
		System.out.println(s.getInetAddress().getHostAddress());

		InputStream in = s.getInputStream();

		byte[] buf = new byte[1024];

		int len = in.read(buf);

		System.out.println(new String(buf,0,len));


		PrintWriter out = new PrintWriter(s.getOutputStream(),true);

		out.println("<font color='red' size='7'>�ͻ������</font>");

		s.close();

		ss.close();
	}
}
