
/*
�쳣�����ǳ���������ʱ���ֲ����������
�쳣����������Ҳ����ʵ������һ����������Ҳ����ͨ��java�������ʽ��������������װ�ɶ���
			��ʵ����java�Բ������������������Ķ������֡�

��������Ļ��֣����֣�һ�������ص����⣬һ�ַ����ص����⡣

�������صģ�javaͨ��Error�����������
	����Errorһ�㲻��д����ԵĴ��������д���

��������صģ�javaͨ��Exception�����������
	����Exception����ʹ������ԵĴ���ʽ���д���

����Error����Exception������һЩ�������ݡ�
���磺�������������Ϣ������ԭ��ȡ�

Throwable
	|--Error
	|--Exception




2,�쳣�Ĵ���

java �ṩ�����е������д���
try
{
	��Ҫ�����Ĵ��룻
}
catch(�쳣�� ����)
{
	�����쳣�Ĵ��룻(����ʽ)
}
finally
{
	һ����ִ�е���䣻
}


3���Բ��񵽵��쳣������г�������������
	String getMessage()����ȡ�쳣��Ϣ��


�ں����������쳣��
������߰�ȫ�ԣ��õ��ó����д������������ʧ�ܡ�



�Զ��쳣�Ĵ���

1�������쳣ʱ������������Ϊ������쳣����������Ŀ��Ը����塣
2���Է����������쳣���Ͷ�Ӧ�м���catch�顣��Ҫ��������catch�顣
	������catch���е��쳣���ּ̳й�ϵ�������쳣catch����������档


�����ڽ���catch����ʱ��catch��һ��Ҫ������崦��ʽ��
��Ҫ�򵥶���һ�� e.printStackTrace(),
Ҳ��Ҫ�򵥵ľ���дһ�������䡣


*/

class Demo
{
	int div(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException//�ڹ�����ͨ��throws�Ĺؼ��������˸ù����п��ܻ�������⡣
	{

		int[] arr = new int[a];

		System.out.println(arr[4]);

		return a/b;
	}
}


class  ExceptionDemo2
{
	public static void main(String[] args) //throws Exception
	{
		Demo d = new Demo();
		try
		{
			int x = d.div(5,0);
			System.out.println("x="+x);
		}
		
		catch(Exception e)
		{
			System.out.println("hahah:"+e.toString());
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.toString());
			System.out.println("�������!!");

		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
			System.out.println("�Ǳ�Խ��������");
		}
		
		/**/
		

		System.out.println("over");

	}
}
