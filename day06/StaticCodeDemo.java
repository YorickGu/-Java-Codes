/*
��̬����顣
��ʽ��
static
{
	��̬������е�ִ����䡣
}

�ص㣺������ļ��ض�ִ�У�ִֻ��һ��,����������������
���ڸ�����г�ʼ���ġ�

*/

class StaticCode
{
	int num = 9;
	StaticCode()
	{
		System.out.println("b");
	}

	static
	{
		System.out.println("a");
	}
	{
		System.out.println("c"+this.num);
	}

	StaticCode(int x)
	{
		System.out.println("d");
	}
	public static void show()
	{
		System.out.println("show run");
	}
}

class StaticCodeDemo 
{
	static
	{
		//System.out.println("b");
	}
	public static void main(String[] args) 
	{
		new StaticCode(4);//a c d 
		//new StaticCode();
		//new StaticCode();
		//System.out.println("over");
		//StaticCode.show();
		//StaticCode s = null;
		//s = new StaticCode();

		//StaticCode.show();


	}
	static
	{
		///System.out.println("c");
	}
}
//d:\>java0217\day06>java StaticCodeDemo
//b c a over