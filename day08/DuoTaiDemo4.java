class Fu
{
	static int num = 5;
	void method1()
	{
		System.out.println("fu method_1");
	}
	void method2()
	{
		System.out.println("fu method_2");
	}
	static void method4()
	{
		System.out.println("fu method_4");
	}
}


class Zi extends Fu
{
	static int num = 8;
	void method1()
	{
		System.out.println("zi method_1");
	}
	void method3()
	{
		System.out.println("zi method_3");
	}

	static void method4()
	{
		System.out.println("zi method_4");
	}
}
class  DuoTaiDemo4
{
	public static void main(String[] args) 
	{
		
//		Fu f = new Zi();
//
//		System.out.println(f.num);
//
//		Zi z = new Zi();
//		System.out.println(z.num);

		//f.method1();
		//f.method2();
		//f.method3();

		Fu f = new Zi();
		System.out.println(f.num);
		f.method4();

		Zi z = new Zi();
		z.method4();

	
		
/*
�ڶ�̬�г�Ա�������ص㣺
�ڱ���ʱ�ڣ����������ͱ��������������Ƿ��е��õķ���������У�����ͨ�������û�б���ʧ�ܡ�
������ʱ�ڣ����Ķ��������������Ƿ��е��õķ�����
���ܽ���ǣ���Ա�����ڶ�̬����ʱ�����뿴��ߣ����п��ұߡ�


�ڶ�̬�У���Ա�������ص㣺
���۱�������У����ο����(�����ͱ�����������)��


�ڶ�̬�У���̬��Ա�������ص㣺
���۱�������У����ο�����ߡ�


*/


//		Zi z = new Zi();
//		z.method1();
//		z.method2();
//		z.method3();
	}
}	
