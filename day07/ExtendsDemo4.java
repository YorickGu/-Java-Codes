/*
3���Ӹ����еĹ��캯����

�ڶ����������г�ʼ��ʱ������Ĺ��캯��Ҳ�����У�
������Ϊ����Ĺ��캯��Ĭ�ϵ�һ����һ����ʽ����� super();
super():����ʸ����пղ����Ĺ��캯�����������������еĹ��캯��Ĭ�ϵ�һ�ж���super();

Ϊʲô����һ��Ҫ���ʸ����еĹ��캯����

��Ϊ�����е������������ֱ�ӻ�ȡ��������������ڽ���ʱ����Ҫ�Ȳ鿴��������ζ���Щ���ݽ��г�ʼ���ġ�
���������ڶ����ʼ��ʱ��Ҫ�ȷ���һ�¸����еĹ��캯����
���Ҫ���ʸ�����ָ���Ĺ��캯��������ͨ���ֶ�����super���ķ�ʽ��ָ����

ע�⣺super���һ�����������๹�캯���ĵ�һ�С�



�����ʵ�������̡�

���ۣ�
��������еĹ��캯����Ĭ�϶�����ʸ����пղ����Ĺ��캯����
��Ϊ����ÿһ�����캯���ڵĵ�һ�ж���һ����ʽsuper();

��������û�пղ����Ĺ��캯��ʱ����������ֶ�ͨ��super�����ʽ��ָ��Ҫ���ʸ����еĹ��캯����

��Ȼ������Ĺ��캯����һ��Ҳ�����ֶ�ָ��this��������ʱ����еĹ��캯����
���������ٻ���һ�����캯������ʸ����еĹ��캯����
*/
class Fu //extends Object
{
	int num ;
	Fu()
	{
		//super();
		num= 60;
		System.out.println("fu run");
	}
	Fu(int  x)
	{
		System.out.println("fu ...."+x);
	}
	
}

class Zi extends Fu
{
	Zi()
	{
		
		super();  
		//super(4);
		System.out.println("zi run");
	}
	Zi(int x)
	{
		this();
		//super();
		//super(3);
		System.out.println("zi..."+x);
	}
}

class  ExtendsDemo4
{
	public static void main(String[] args) 
	{
		Zi z = new Zi(0);
		System.out.println(z.num);
	}
}

/*
class Person
{
	private  String name;
	Person(String name)
	{
		this.name = name;
	}

	void show(){}
}
class Student extends Person
{
	Student(String name)
	{
		super(name);
	}
	void method()
	{
		super.show();
	}
}
*/


