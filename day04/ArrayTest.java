/*
����һ������{5,1,6,4,2,8,9}��

1����ȡ�����е����ֵ���Լ���Сֵ��


*/

class ArrayTest 
{

	/*
	��ȡ�����е����ֵ��
	˼·��
	1����ȡ��ֵ��Ҫ���бȽϡ�ÿһ�αȽ϶�����һ���ϴ��ֵ����Ϊ��ֵ��ȷ����
	ͨ��һ�����������ٴ���
	2���������е�ÿһ��Ԫ�ض�����������е�ֵ���бȽϡ�
	��������˱����е�ֵ�����øøñ�����¼�ϴ�ֵ��
	3�������е�Ԫ�ض��Ƚ���ɣ���ô�ñ����д洢�ľ��������е����ֵ�ˡ�

	���裺
	1�������������ʼ��Ϊ����������һ��Ԫ�ؼ��ɡ�
	2��ͨ��ѭ������������б�����
	3���ڱ��������ж����ж������������������Ԫ�رȱ����е�Ԫ�ش󣬾͸�ֵ���ñ�����
	
	��Ҫ����һ����������ɡ��Ա���߸����ԡ�
	1����ȷ����������е����Ԫ�� int����
	2��δ֪���ݣ�һ�����顣int[]
	*/
	public static int getMax(int[] arr)
	{
		int max = arr[0];

		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]>max)
				max = arr[x];
		}
		return max;
	}


	/*
	��ȡ���ֵ����һ�ַ�ʽ��
	�ɲ����Խ���ʱ������ʼ��Ϊ0�أ����ԡ����ַ�ʽ����ʵ���ڳ�ʼ��Ϊ����������һ���Ǳꡣ


	*/
	public static int getMax_2(int[] arr)
	{
		int max = 0;

		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]>arr[max])
				max = x;
		}
		return arr[max];
	}


	/*
	��ȡ��Сֵ��
	*/
	public static int getMin(int[] arr)
	{
		int min = 0;
		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]<arr[min])
				min = x;
		}
		return arr[min];
	}

	//��ȡdouble������������ֵ����Ϊ����һ�£����Զ�����ͬ�������ơ���������ʽ���ڡ�
	/*
	public static double getMax(double[] arr)
	{
		
	}
	*/
	public static void main(String[] args)
	{
		int[] arr ={5,1,6,4,2,8,9};

		int max = getMax_2(arr);
		int min = getMin(arr);
		System.out.println("max="+max);
		System.out.println("min="+min);


//		boolean[] ar = new boolean[3];
//		System.out.println(ar[1]);
	}

}
