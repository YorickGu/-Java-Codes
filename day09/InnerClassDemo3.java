/*
�ڲ��ඨ���ھֲ�ʱ��
1�������Ա���Ա���η�����
2������ֱ�ӷ����ⲿ���еĳ�Ա����Ϊ�������ⲿ���е����á�
	���ǲ����Է��������ڵľֲ��еı�����ֻ�ܷ��ʱ�final���εľֲ�������
*/
class Outer
{
	int x = 3;

	void method(final int a)
	{
		final int y = 4;
		class Inner
		{
			void function()
			{
				System.out.println(y);
			}
		}
	
		new Inner().function();
		
	}
}


class  InnerClassDemo3
{
	public static void main(String[] args) 
	{
		Outer out = new Outer();
		out.method(7);
		out.method(8);
	}

}
