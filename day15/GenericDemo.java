
import java.util.*;

/*
���ͣ�JDK1.5�汾�Ժ���������ԡ����ڽ����ȫ���⣬��һ�����Ͱ�ȫ���ơ�

�ô�
1.������ʱ�ڳ�������ClassCastException��ת�Ƶ��˱���ʱ�ڡ���
	�����ڳ���Ա������⡣������ʱ������٣���ȫ����

2��������ǿ��ת���鷳��


���͸�ʽ��ͨ��<>������Ҫ�����������������͡�

��ʹ��java�ṩ�Ķ���ʱ��ʲôʱ��д�����أ�

ͨ���ڼ��Ͽ���кܳ�����
ֻҪ����<>��Ҫ���巺�͡�

��ʵ<> ���������������͵ġ�

��ʹ�ü���ʱ����������Ҫ�洢������������Ϊ�������ݵ�<>�м��ɡ�





*/

class GenericDemo 
{
	public static void main(String[] args) 
	{

		ArrayList<String> al = new ArrayList<String>();

		al.add("abc01");
		al.add("abc0991");
		al.add("abc014");

		//al.add(4);//al.add(new Integer(4));
		

		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			String s = it.next();

			System.out.println(s+":"+s.length());
		}
	}
}
