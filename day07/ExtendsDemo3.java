
/*
2,�Ӹ����еĺ�����

��������ֺ͸���һģһ���ĺ���ʱ��
�����������øú��������������ຯ�������ݡ�
��ͬ����ĺ���������һ����

��������Ǻ�������һ�����ԣ���д(����)


������̳и��࣬��Ϯ�˸���Ĺ��ܣ��������У�
����������߱��ù��ܣ����ǹ��ܵ�����ȴ�͸��಻һ�£�
��ʱ��û�б�Ҫ�����¹��ܣ�����ʹ�ø������⣬��������Ĺ��ܶ��壬����д�������ݡ�


���ǣ�
1�����า�Ǹ��࣬���뱣֤����Ȩ�޴��ڵ��ڸ���Ȩ�ޣ��ſ��Ը��ǣ��������ʧ�ܡ�

2����ֻ̬�ܸ��Ǿ�̬��


��ס��ң�
���أ�ֻ��ͬ�������Ĳ����б�
��д���Ӹ��෽��Ҫһģһ����
*/

class Fu
{
	void show()
	{
		System.out.println("fu show");
	}
	void speak()
	{
		System.out.println("vb");
	}
}

class Zi extends Fu
{
	void speak()
	{
		System.out.println("java");
	}
	void show()
	{
		System.out.println("zi show");
	}
}


class ExtendsDemo3 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		z.speak();

	}
}


class Tel
{
	void show()
	{
		System.out.println("number");
	}
	
}

class NewTel extends Tel
{
	void show()
	{
		//System.out.println("number");
		super.show();
		System.out.println("name");
		System.out.println("pic");
	}
}

