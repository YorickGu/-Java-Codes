import java.util.*;

/*
ȥ��ArrayList�����е��ظ�Ԫ�ء�

*/

class ArrayListTest 
{

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();

		al.add("java01");
		al.add("java02");
		al.add("java01");
		al.add("java02");
		al.add("java01");
//		al.add("java03");


		/*
		�ڵ���ʱѭ����next����һ�Σ���ҪhasNext�ж�һ�Ρ�
		Iterator it = al.iterator();

		while(it.hasNext())
		{
			sop(it.next()+"...."+it.next());
		}
		*/

		/**/
		sop(al);
		
		al = singleElement(al);

		sop(al);
		

	}

	public static ArrayList singleElement(ArrayList al)
	{
		//����һ����ʱ������
		ArrayList newAl = new ArrayList();

		Iterator it = al.iterator();

		while(it.hasNext())
		{
			Object obj = it.next();

			if(!newAl.contains(obj))
				newAl.add(obj);

		}

		return newAl;
	}
}
