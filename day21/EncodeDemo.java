
/*
���룺�ַ�������ֽ����顣


���룺�ֽ��������ַ�����

String-->byte[];  str.getBytes(charsetName);


byte[] -->String: new String(byte[],charsetName);

*/
import java.util.*;
class  EncodeDemo
{
	public static void main(String[] args)throws Exception 
	{
		String s = "����";

		byte[] b1 = s.getBytes("GBK");

		System.out.println(Arrays.toString(b1));
		String s1 = new String(b1,"utf-8");
		System.out.println("s1="+s1);

		//��s1����iso8859-1���롣
		byte[] b2 = s1.getBytes("utf-8");
		System.out.println(Arrays.toString(b2));

		String s2 = new String(b2,"gbk");

		System.out.println("s2="+s2);

		

	}
}
