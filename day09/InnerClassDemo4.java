/*	
�����ڲ���:
1�������ڲ�����ʵ�����ڲ���ļ�д��ʽ��
2�����������ڲ����ǰ�᣺
	�ڲ�������Ǽ̳�һ�������ʵ�ֽӿڡ�
3�������ڲ���ĸ�ʽ��  new ������߽ӿ�(){�������������}
4����ʵ�����ڲ������һ������������󡣶�����������е��֡�	�������Ϊ�����ݵĶ���
5�������ڲ����ж���ķ�����ò�Ҫ����3����


*/
abstract class AbsDemo
{
	abstract void show();
	
}


class Outer
{
	int x = 3;

	/*
	class Inner extends AbsDemo
	{
		int num = 90;
		void show()
		{
			System.out.println("show :"+num);
		}
		void abc()
		{
			System.out.println("hehe");
		}
	}
	*/

	public void function()
	{
		//AbsDemo a = new Inner();
//		Inner in = new Inner();
//		in.show();
//		in.abc();
	

		AbsDemo d = new AbsDemo()
		{
			int num = 9;
			void show()
			{
				System.out.println("num==="+num);
			}
			void abc()
			{
				System.out.println("haha");
			}
		};

		d.show();
		//d.abc();//����ʧ��;

		



	}
}



class InnerClassDemo4 
{
	public static void main(String[] args) 
	{
		new Outer().function();
	}
}


