
import java.util.*;
class RegexTest 
{
	public static void main(String[] args) 
	{
//		test_1();
//		ipSort();

		checkMail();
	}



	/*
	���󣺶��ʼ���ַ����У�顣

	*/
	public static void checkMail()
	{
		String mail = "abc12@sina.com";

		mail = "1@1.1";

		String reg = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";//��Ϊ��ȷ��ƥ�䡣
		reg = "\\w+@\\w+(\\.\\w+)+";//��Բ�̫��ȷ��ƥ�䡣

		//mail.indexOf("@")!=-1


		System.out.println(mail.matches(reg));
	}

	/*
	����
	�������ַ���ת�ɣ���Ҫѧ���.
	
	���������ֹ����е���һ���أ������ļ����أ�
	˼·��ʽ��
	1�����ֻ��֪�����ַ��Ƿ���Ǵ�ʹ��ƥ�䡣
	2����Ҫ�����е��ַ��������һ���ַ������滻��
	3����Ҫ�����Զ��ķ�ʽ���ַ�����ɶ���ַ������и��ȡ����������Ӵ���
	4����Ҫ�õ�����������ַ����Ӵ�����ȡ����ȡ���Ϲ�����Ӵ���
	*/
	public static void test_1()
	{
		String str = "����...����...��Ҫ..ҪҪ...ҪҪ...ѧѧѧ....ѧѧ...����...���..��.�̳�...��...��";
		/*
		�������ַ��������һ���ַ�����ʹ�� �滻���ܡ�
		1,�����Ƚ� . ȥ����
		2���ڽ�����ظ������ݱ�ɵ������ݡ�
		*/
		str = str.replaceAll("\\.+","");
		System.out.println(str);

		str = str.replaceAll("(.)\\1+","$1");
		
		System.out.println(str);

	}
	/*
	192.68.1.254 102.49.23.013 10.10.10.10 2.2.2.2 8.109.90.30
	��ip��ַ���е�ַ��˳�������


	�������ַ�����Ȼ˳��ֻҪ������ÿһ�ζ���3λ���ɡ�
	1������ÿһ����Ҫ������0���в��룬��ôÿһ�ξͻ����ٱ�֤��3λ��
	2����ÿһ��ֻ����3λ�����������е�ip��ַ����ÿһ��3λ��

	*/
	public static void ipSort()
	{
		String ip = "192.68.1.254 102.49.23.013 10.10.10.10 2.2.2.2 8.109.90.30";

		ip = ip.replaceAll("(\\d+)","00$1");
		System.out.println(ip);

		ip = ip.replaceAll("0*(\\d{3})","$1");
		System.out.println(ip);

		String[] arr = ip.split(" ");

		TreeSet<String> ts = new TreeSet<String>();

		for(String s : arr)
		{
			ts.add(s);
		}

		for(String s : ts)
		{
			System.out.println(s.replaceAll("0*(\\d+)","$1"));
		}
	}

	

}
