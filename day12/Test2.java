class test_parent
{
	int x = 5;
	int y = 10;
	void set_value(int a, int b)
	{
		x = a;
		y = b;
	}
	int get_1()
	{
		return this.x + this.y;
	}
	int get_2()
	{
		return x - y;
	}
}

class test_4 extends test_parent
{
	int y;
	test_4(int a)
	{
		y = a;
	}
	void set_value(int a, int b)
	{
		x = a;
		y = b;
	}
	int get_2()
	{
		return y;
	}
}

class  Test2
{
	public static void main(String[] args) 
	{
		test_4  a1=new test_4(1);
		int x = a1.get_1();
		System.out.println("x="+x);
	}
}
/*

��������漸�ֲ�ͬ�ķ��������࣬д��Ҫ��Ľ����
    (3) ��  test_4  a1=new test_4(1) ��a1.get_1()������Ϊ_____ ��
	(4) ��  test_4  a1=new test_4(��1) ��a1.set _value(5,5) ��a1.get_2()������Ϊ
_____��

*/