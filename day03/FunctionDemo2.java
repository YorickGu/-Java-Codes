class FunctionDemo2 
{
	public static void main(String[] args) 
	{
		/*
		int sum = getSum(4,6);

		System.out.println("sum="+sum);
		sum = getSum(2,7);
		System.out.println("sum="+sum);
		*/
		//get(4,5);
		int x = getSum(4,4);
		int y = getSum(7,9);
		int num = getMax(x,y);

	}
	
	/*
	������ܶ���˼�������⣬Ϊʲô�أ���ΪֻΪ��ɼӷ����㣬�����Ƿ�Ҫ�Ժͽ��д�ӡ������
	���ǵ����ߵ��£���Ҫ�ڸù�������ɡ�

	public static void get(int a,int b)
	{
		System.out.println(a+b);
		return ;
	}
	*/

	/*
	
	��ζ���һ�������أ�
	1����Ȼ������һ�������Ĺ��ܣ���ô�ù��ܵ���������ʲô����ȷ
		��Ϊ��������ȷ�����ķ���ֵ���͡�
	2������ȷ�ڶ���ù��ܵĹ������Ƿ���Ҫδ֪�����ݲ������㡣
		��Ϊ������ȷ�����Ĳ����б����������ͺͲ����ĸ�������

	*/

	//���󣺶���һ�����ܡ����3+4�����㡣����������ظ������ߡ�
	/*
	1����ȷ���ܵĽ������һ�������ĺ͡�
	2����ʵ�ָù��ܵĹ������Ƿ���δ֪���ݲ������㣬û�С�
	��ʵ���������ܾ�������ȷ�����Ķ��塣
	1��������ȷ�����ķ���ֵ���͡�
	2����ȷ�����Ĳ����б�( ���������ͺͲ����ĸ���)��
	
	
	public static int getSum()
	{
		return 3+4;
	}
	*/
	/*
	������������Ĺ��ܣ�����ǹ̶��ģ�������չ�Զ��ԡ�
	Ϊ�˷����û��������û���ָ�������ͱ����������������ܲ������塣
	˼·��
	1�����ܽ����һ���͡�����ֵ������int��
	2����δ֪���ݲ������㡣���������������δ֪���ݵ����Ͷ���int��
	*/
	public static int getSum(int x,int y)
	{
		return x+y;
	}
	

	/*
	�����ж��������Ƿ���ͬ��
	˼·��
	1����ȷ���ܵĽ��������ǣ�boolean ��
	2�������Ƿ���δ֪���ݲ������㡣�У�����������
	*/
	public static boolean compare(int a,int b)
	{
		/*
		if(a==b)
			return true;
		//else
			return false;
		*/

		//return (a==b)?true:false;

		return a==b;
	}

	/*
	���󣺶��幦�ܣ������������бȽϡ���ȡ�ϴ������
	*/
	public static int getMax(int a,int b)
	{
		/*
		if(a>b)
			return a;
		else
			return b;
			*/
		return (a>b)?a:b;
	}
}
