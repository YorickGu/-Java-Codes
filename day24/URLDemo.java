import java.net.*;
class URLDemo 
{
	public static void main(String[] args) throws MalformedURLException
	{
		URL url = new URL("http://192.168.1.254/myweb/demo.html?name=haha&age=30");


		System.out.println("getProtocol() :"+url.getProtocol());
		System.out.println("getHost() :"+url.getHost());
		System.out.println("getPort() :"+url.getPort());
		System.out.println("getPath() :"+url.getPath());
		System.out.println("getFile() :"+url.getFile());
		System.out.println("getQuery() :"+url.getQuery());

		/*int port = getPort();
		if(port==-1)
			port = 80;

		getPort()==-1
		*/
	}
}
/*
 String getFile() 
          ��ȡ�� URL ���ļ����� 
 String getHost() 
          ��ȡ�� URL ����������������ã��� 
 String getPath() 
          ��ȡ�� URL ��·�����֡� 
 int getPort() 
          ��ȡ�� URL �Ķ˿ںš� 
 String getProtocol() 
          ��ȡ�� URL ��Э�����ơ� 
 String getQuery() 
          ��ȡ�� URL �Ĳ�ѯ�� 

*/