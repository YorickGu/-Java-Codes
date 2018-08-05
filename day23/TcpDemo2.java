import java.io.*;
import java.net.*;
/*
��ʾtcp�Ĵ���Ŀͻ��˺ͷ���˵Ļ��á�

���󣺿ͻ��˸�����˷������ݣ�������յ��󣬸��ͻ��˷�����Ϣ��

*/

/*
�ͻ��ˣ�
1������socket����ָ��Ҫ���������Ͷ˿ڡ�
2����ȡsocket���е��������������д�������С�ͨ�����緢�͸�����ˡ�
3����ȡsocket���е���������������˷��������ݻ�ȡ��������ӡ��
4���رտͻ�����Դ��

*/
class TcpClient2 
{
	public static void main(String[] args)throws Exception 
	{
		Socket s = new Socket("192.168.1.254",10004);
		
		OutputStream out = s.getOutputStream();

		out.write("����ˣ����".getBytes());

		
		InputStream in = s.getInputStream();

		byte[] buf = new byte[1024];

		int len = in.read(buf);

		System.out.println(new String(buf,0,len));

		s.close();
	}
}


class TcpServer2
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(10004);

		Socket s = ss.accept();

		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"....connected");
		InputStream in = s.getInputStream();

		byte[] buf = new byte[1024];

		int len = in.read(buf);

		System.out.println(new String(buf,0,len));


		OutputStream out = s.getOutputStream();


		Thread.sleep(10000);
		out.write("�����յ�,��Ҳ��".getBytes());

		s.close();

		ss.close();
	}
}
