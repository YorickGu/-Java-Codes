

/*
Exceptoin����һ������������쳣RuntimeException ����ʱ�쳣��

����ں��������׳����쳣�������Ͽ��Բ�������������һ��ͨ����

����ں����������˸��쳣�������߿��Բ��ý��д�������һ��ͨ����

֮���Բ����ں�������������Ϊ����Ҫ�õ����ߴ���
�����쳣������ϣ������ֹͣ����Ϊ������ʱ���������޷���������������ϣ��ֹͣ�����
�Դ������������




�Զ����쳣ʱ��������쳣�ķ������޷��ڼ����������㣬
�����Զ����쳣�̳�RuntimeException��


�����쳣�����֣�
1������ʱ�������쳣��
	
2������ʱ���������쳣(����ʱ�쳣��RuntimeException�Լ�������)

*/

class FuShuException extends RuntimeException
{
	FuShuException(String msg)
	{
		super(msg);
	}
}
class Demo
{
	int div(int a,int b)throws Exception//throws ArithmeticException
	{
		
		if(b<0)
			throw new Exception("�����˳���Ϊ������");
		if(b==0)
			throw new ArithmeticException("�������");
		return a/b;
	}
}

class ExceptionDemo4 
{
	public static void main(String[] args) 
	{
		
		Demo d = new Demo();
		
		int x = d.div(4,-9);
		System.out.println("x="+x);		
		
		System.out.println("over");
	}
}

/*
class Person
{
	public void checkName(String name)
	{
		
		//if(name.equals("lisi"))//NullPointerException
		if("lisi".equals(name))//if(name!=null && name.equals("lisi"))
			System.out.println("YES");
		else
			System.out.println("no");
	}
}

main()
{
	Person p = new Person();
	p.checkName(null);
}
*/