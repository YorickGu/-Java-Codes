/*
�ڲ���ķ��ʹ���
1���ڲ������ֱ�ӷ����ⲿ���еĳ�Ա������˽�С�
	֮���Կ���ֱ�ӷ����ⲿ���еĳ�Ա������Ϊ�ڲ����г�����һ���ⲿ������ã���ʽ �ⲿ����.this
2���ⲿ��Ҫ�����ڲ��࣬���뽨���ڲ������

���ʸ�ʽ��
1,���ڲ��ඨ�����ⲿ��ĳ�Աλ���ϣ����ҷ�˽�У��������ⲿ�������С�
����ֱ�ӽ����ڲ������
��ʽ
	�ⲿ����.�ڲ�����  ������ = �ⲿ�����.�ڲ������;
	Outer.Inner in = new Outer().new Inner();

2,���ڲ����ڳ�Աλ���ϣ��Ϳ��Ա���Ա���η������Ρ�
	���磬private�����ڲ������ⲿ���н��з�װ��
		static:�ڲ���;߱�static�����ԡ�
		���ڲ��౻static���κ�ֻ��ֱ�ӷ����ⲿ���е�static��Ա�������˷��ʾ��ޡ�

		���ⲿ�������У����ֱ�ӷ���static�ڲ���ķǾ�̬��Ա�أ�
		new Outer.Inner().function();

		���ⲿ�������У����ֱ�ӷ���static�ڲ���ľ�̬��Ա�أ�
		uter.Inner.function();

	ע�⣺���ڲ����ж����˾�̬��Ա�����ڲ��������static�ġ�
		  ���ⲿ���еľ�̬���������ڲ���ʱ���ڲ���Ҳ������static�ġ�



	
����������ʱ��������ڲ�����������������ڲ�����������
��Ϊ�ڲ�������ʹ���ⲿ��������ݡ�

class Body
{
	private class XinZang
	{

	}

	public void show()
	{
		new XinZang().
	}
	
}





*/
class Outer
{
	private static  int x = 3;

	
	static class Inner//��̬�ڲ���
	{
		static void function()
		{
			System.out.println("innner :"+x);
		}
	}

	static class Inner2
	{
		void show()
		{
			System.out.println("inner2 show");
		}
	}

	public static void method()
	{
		//Inner.function();
		new Inner2().show();
	}

}


class  InnerClassDemo2
{
	public static void main(String[] args) 
	{
		Outer.method();
		//Outer.Inner.function();
		//new Outer.Inner().function();
		//ֱ�ӷ����ڲ����еĳ�Ա��
//		Outer.Inner in = new Outer().new Inner();
//		in.function();
	}
}
