/*
JDK1.5�汾���ֵ������ԡ�

�����Ŀɱ������
��ʹ��ʱע�⣺�ɱ����һ��Ҫ�����ڲ����б�����档

*/

class  ParamMethodDemo
{
	public static void main(String[] args) 
	{
		//show(3,4);
		/*
		//��Ȼ�ٶ����˶��������
		����ÿ�ζ�Ҫ����һ�����顣��Ϊʵ�ʲ�����

		int[] arr = {3,4};
		show(arr);

		int[] arr1 = {2,3,4,5};
		show(arr1);
		*/

		/*
		�ɱ������
		��ʵ������һ����������ļ�д��ʽ��
		����ÿһ�ζ��ֶ��Ľ����������
		ֻҪ��Ҫ������Ԫ����Ϊ�������ݼ��ɡ�
		��ʽ����Щ������װ�������顣

		*/
		show("haha",2,3,4,5,6);
		//show(2,3,4,5,6,4,2,35,9,"heh");
		//show();

	}
	public static void show(String str,int... arr)
	{
		System.out.println(arr.length);
	}
	/*
	public static void show(int[] arr)
	{
		
	}
	*/
	/*
	public static  void show(int a,int b)
	{
		System.out.println(a+","+b);
	}
	public static  void show(int a,int b,int c)
	{}
	*/
}
