
/*
�쳣�����ǳ���������ʱ���ֲ����������
�쳣����������Ҳ����ʵ������һ����������Ҳ����ͨ��java�������ʽ��������������װ�ɶ���
			��ʵ����java�Բ������������������Ķ������֡�

��������Ļ��֣����֣�һ�������ص����⣬һ�ַ����ص����⡣

�������صģ�javaͨ��Error�����������
	����Errorһ�㲻��д����ԵĴ��������д�����

��������صģ�javaͨ��Exception�����������
	����Exception����ʹ������ԵĴ�����ʽ���д�����

����Error����Exception������һЩ�������ݡ�
���磺�������������Ϣ������ԭ��ȡ�

Throwable
	|--Error
	|--Exception




2,�쳣�Ĵ���

java �ṩ�����е������д�����
try
{
	��Ҫ�����Ĵ��룻
}
catch(�쳣�� ����)
{
	�����쳣�Ĵ��룻(������ʽ)
}
finally
{
	һ����ִ�е���䣻
}


3���Բ��񵽵��쳣������г�������������
	String getMessage()����ȡ�쳣��Ϣ��




*/

class Demo
{
	int div(int a,int b)throws Exception//�ڹ�����ͨ��throws�Ĺؼ��������˸ù����п��ܻ�������⡣
	{
		return a/b;
	}
}


class  ExceptionDemo
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		try
		{
			int x = d.div(4,1);
			System.out.println("x="+x);
		}
		catch (Exception e)//Exception e = new ArithmeticException();
		{
			System.out.println("������");
			System.out.println(e.getMessage());//  / by zero;
			System.out.println(e.toString());// �쳣���� �� �쳣��Ϣ��

			e.printStackTrace();//�쳣���ƣ��쳣��Ϣ���쳣���ֵ�λ�á�
							//��ʵjvmĬ�ϵ��쳣�������ƣ������ڵ���printStackTrace������
							//��ӡ�쳣�Ķ�ջ�ĸ�����Ϣ��


		}		
		

		System.out.println("over");

	}
}