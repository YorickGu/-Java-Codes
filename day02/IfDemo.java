class IfDemo 
{
	public static void main(String[] args) 
	{
		int x = 1;

		if(x>1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("a");
		}
		
		/*
		if else �ṹ ��д��ʽ�� ���� = (�������ʽ)?���ʽ1�����ʽ2��
		
		��Ԫ�������
			�ô������Լ�if else���롣
			�׶ˣ���Ϊ��һ����������������������Ҫ��һ�������
		*/
		int a = 9,b;
		b = (a>1)?100:200;

		if(a>1)
			b = 100;
		else
			b = 200;


		int n = 3;

		if(n>1)
			System.out.println("a");
		else if(n>2)
			System.out.println("b");
		else if(n>3)
			System.out.println("c");
		else
			System.out.println("d");

		/*
		if(n>1)
			System.out.println("a");
		if(n>2)
			System.out.println("b");
		if(n>3)
			System.out.println("c");
		else
			System.out.println("d");
		*/
		System.out.println("over");
	}
}
