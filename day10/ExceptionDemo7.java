
/*
�쳣���Ӹ��า���е����֣�
1�������ڸ��Ǹ���ʱ���������ķ����׳��쳣����ô����ĸ��Ƿ�����ֻ���׳�������쳣���߸��쳣�����ࡣ
2��������෽���׳�����쳣����ô�����ڸ��Ǹ÷���ʱ��ֻ���׳������쳣���Ӽ���
3�����������߽ӿڵķ�����û���쳣�׳�����ô�����ڸ��Ƿ���ʱ��Ҳ�������׳��쳣��
	������෽���������쳣���ͱ���Ҫ����try�������Բ����ס�

*/


class AException extends Exception
{
}

class BException extends AException
{
}

class CException extends Exception
{
}

/*
Exception 
	|--AException
		|--BException
	|--CException
*/
class Fu
{
	void show()throws AException
	{
	
	}
}

class Test
{
	void function(Fu f)
	{
		try
		{
			f.show();
		}
		catch (AException e)
		{

		}
		
	}
}


class Zi extends Fu
{
	void show()throws CException
	{
		
	}
}


class  
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.function(new Zi());
	}
}
