

/*
	finally����飺����һ��ִ�еĴ��롣
	ͨ�����ڹر���Դ��

*/
class FuShuException extends Exception
{
	FuShuException(String msg)
	{
		super(msg);
	}
}

class Demo
{
	int div(int a,int b)throws FuShuException
	{
		if(b<0)
			throw new FuShuException("����Ϊ����");
		return a/b;
	}
}

class  ExceptionDemo5
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();

		try
		{
			int x = d.div(4,-1);
			System.out.println("x="+x);

		}
		catch (FuShuException e)
		{
			System.out.println(e.toString());
			return;
			//System.exit(0);//ϵͳ���˳���jvm������
		}
		finally
		{
			System.out.println("finally");//finally�д�ŵ���һ���ᱻִ�еĴ��롣
		}


		System.out.println("over");
	}
}


class NoException extends Exception
{
}

public void method()throws NoException
{

	�������ݿ�;

	���ݲ���;//throw new SQLException();

	�ر����ݿ�;//�ö������������ݲ����Ƿ�ɹ���һ��Ҫ�ر���Դ��


	try
	{
		
		�������ݿ�;

		���ݲ���;//throw new SQLException();
	}
	catch (SQLException e)
	{
		������ݿ�����쳣����;
		throw new NoException();

	}
	finally
	{
		�ر����ݿ�;
	}


}