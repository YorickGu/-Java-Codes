import java.util.*;

/*
������ϰ��
1����ȡ������Ķ����ж����졣
	˼·������ָ��������һ��ʱ����� 
	c.set(year,2,1)//ĳһ���3��1�ա�
	c.add(Calenar.DAY_OF_MONTH,-1);//3��1�գ���ǰ��һ�죬����2�����һ�졣



2����ȡ������������ʱ�̡�
	c.add(Calenar.DAY_OF_MONTH,-1);


*/


class  CalendarDemo2
{
	public static void main(String[] args) 
	{

		Calendar c = Calendar.getInstance();

		//c.set(2012,2,23);

		c.add(Calendar.DAY_OF_MONTH,-18);
		
		printCalendar(c);
	}

	public static void printCalendar(Calendar c)
	{
		String[] mons = {"һ��","����","����","����"
					,"����","����","����","����"
					,"����","ʮ��","ʮһ��","ʮ����"};


		String[] weeks = {
						"","������","����һ","���ڶ�","������","������","������","������",
							};		
		int index = c.get(Calendar.MONTH);

		int index1 = c.get(Calendar.DAY_OF_WEEK);

		sop(c.get(Calendar.YEAR)+"��");
		//sop((c.get(Calendar.MONTH)+1)+"��");
		sop(mons[index]);
		sop(c.get(Calendar.DAY_OF_MONTH)+"��");
		//sop("����"+c.get(Calendar.DAY_OF_WEEK));
		sop(weeks[index1]);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
