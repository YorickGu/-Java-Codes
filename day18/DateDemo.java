
import java.util.*;
import java.text.*;
class DateDemo 
{
	public static void main(String[] args) 
	{
		Date d = new Date();
		System.out.println(d);//��ӡ��ʱ�俴������ϣ����Щ��ʽ��

		//��ģʽ��װ��SimpleDateformat�����С�
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��E hh:mm:ss");
		
		//����format������ģʽ��ʽ��ָ��Date����

		String time = sdf.format(d);

		System.out.println("time="+time);

		long l = System.currentTimeMillis();

		Date d1 = new Date(l);

		System.out.println("d1:"+d1);


	}
}
