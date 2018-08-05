class Person
{
	private Person(){}
	private String name = "hah";
	private int age;
	private static  String country = "cn";
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	{
		System.out.println(name+".."+age);
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public void speak()
	{
		System.out.println(this.name+"..."+this.age);
	}

	public static void  showCountry()
	{
		System.out.println("country="+Person.country);
		Person.method();
	}
	public static void method()
	{
		System.out.println("method run");
	}

}

class  PersonDemo
{
	public static void main(String[] args) 
	{
		Person p = new Person("zhangsan",20);
		p.setName("lisi");
		new Person();
	}
}
/*
Person p = new Person("zhangsan",20);

�þ仰������ʲô���飿
1����Ϊnew�õ���Person.class.���Ի����ҵ�Person.class�ļ������ص��ڴ��С�
2��ִ�и����е�static����飬����еĻ�����Person.class����г�ʼ����
3���ڶ��ڴ��п��ٿռ䣬�����ڴ��ַ��
4���ڶ��ڴ��н���������������ԡ�������Ĭ�ϳ�ʼ����
5�������Խ�����ʾ��ʼ����
6���Զ�����й��������ʼ����
7���Զ�����ж�Ӧ�Ĺ��캯����ʼ����
8�����ڴ��ַ����ջ�ڴ��е�p������

*/