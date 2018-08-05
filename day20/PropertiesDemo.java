

/*
Properties��hashtable�����ࡣ
Ҳ����˵���߱�map���ϵ��ص㡣����������洢�ļ�ֵ�Զ����ַ�����

�Ǽ����к�IO�������ϵļ���������

�ö�����ص㣺�������ڼ�ֵ����ʽ�������ļ���

��ô�ڼ�������ʱ����Ҫ�����й̶���ʽ����=ֵ��



��ϰ�����Ƴ������д����������д�������5��ʱ������������ע�����ʾ���������øó���ִ�С�


*/
import java.io.*;
import java.util.*;

class PropertiesDemo 
{
	public static void main(String[] args) throws IOException
	{
		//method_1();
		loadDemo();
	}

	public static void loadDemo()throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("info.txt");

		//�����е����ݼ��ؽ����ϡ�
		prop.load(fis);

		prop.setProperty("wangwu","39");

		FileOutputStream fos = new FileOutputStream("info.txt");

		prop.store(fos,"haha");

	//	System.out.println(prop);
		prop.list(System.out);

		fos.close();
		fis.close();

	}

	//��ʾ����ν����е����ݴ洢�������С�
	//��Ҫ��info.txt�м�ֵ���ݴ浽�����н��в�����
	/*
		1,��һ������info.txt�ļ�������
		2����ȡһ�����ݣ�������������"="�����и
		3���Ⱥ������Ϊ�����ұ���Ϊֵ�����뵽Properties�����м��ɡ�

	*/
	public static void method_1()throws IOException
	{
		BufferedReader bufr = new BufferedReader(new FileReader("info.txt"));

		String line = null;
		Properties prop = new Properties();


		while((line=bufr.readLine())!=null)
		{
			String[] arr = line.split("=");
			///System.out.println(arr[0]+"...."+arr[1]);
			prop.setProperty(arr[0],arr[1]);
		}

		bufr.close();

		System.out.println(prop);
	}



//	���úͻ�ȡԪ�ء�
	public static void setAndGet()
	{
		Properties prop = new Properties();

		prop.setProperty("zhangsan","30");
		prop.setProperty("lisi","39");

//		System.out.println(prop);
		String value = prop.getProperty("lisi");
		//System.out.println(value);
			
		prop.setProperty("lisi",89+"");

		Set<String> names = prop.stringPropertyNames();
		for(String s : names)
		{
			System.out.println(s+":"+prop.getProperty(s));
		}
	}

	
}
