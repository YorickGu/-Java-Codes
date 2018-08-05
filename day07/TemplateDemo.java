
/*
���󣺻�ȡһ�γ������е�ʱ�䡣
ԭ����ȡ����ʼ�ͽ�����ʱ�䲢������ɡ�

��ȡʱ�䣺System.currentTimeMillis();

����������Ż��󣬾Ϳ��Խ���������⡣

���ַ�ʽ��ģ�淽�����ģʽ��

ʲô��ģ�淽���أ�
�ڶ��幦��ʱ�����ܵ�һ������ȷ���ģ�������һ�����ǲ�ȷ������ȷ���Ĳ�����ʹ�ò�ȷ���Ĳ��֣�
��ô��ʱ�ͽ���ȷ���Ĳ��ֱ�¶��ȥ���ɸ��������ȥ��ɡ�


*/

abstract class GetTime
{
	public final void getTime()
	{
		long start = System.currentTimeMillis();

		runcode();

		long end = System.currentTimeMillis();

		System.out.println("���룺"+(end-start));
	}
	public abstract void runcode();

}


class SubTime extends GetTime
{

	public void runcode()
	{
		
		for(int x=0; x<4000; x++)
		{
			System.out.print(x);
		}
	}
}


class  TemplateDemo
{
	public static void main(String[] args) 
	{
		//GetTime gt = new GetTime();
		SubTime gt = new SubTime();
		gt.getTime();
	}
}
