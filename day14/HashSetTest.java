
import java.util.*;

/*
��hashSet�����д����Զ�����
������������ͬΪͬһ���ˣ��ظ�Ԫ�ء�





*/
class HashSetTest 
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();

		hs.add(new Person("a1",11));
		hs.add(new Person("a2",12));
		hs.add(new Person("a3",13));
//		hs.add(new Person("a2",12));
//		hs.add(new Person("a4",14));

		//sop("a1:"+hs.contains(new Person("a2",12)));
			
//		hs.remove(new Person("a4",13));
		

		Iterator it = hs.iterator();

		while(it.hasNext())
		{
			Person p = (Person)it.next();
			sop(p.getName()+"::"+p.getAge());
		}
	}
}
class Person
{
	private String name;
	private int age;
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public int hashCode()
	{
		System.out.println(this.name+"....hashCode");
		return name.hashCode()+age*37;
	}

	public boolean equals(Object obj)
	{

		if(!(obj instanceof Person))
			return false;

		Person p = (Person)obj;
		System.out.println(this.name+"...equals.."+p.name);

		return this.name.equals(p.name) && this.age == p.age;
	}

	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}

/*


*/