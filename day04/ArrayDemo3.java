class ArrayDemo3 
{
	public static void main(String[] args) 
	{
		//����Ĳ�����
		//��ȡ�����е�Ԫ�ء�ͨ�����õ�������

		//int[] arr = new int[3];
		int[] arr = {3,6,5,1,8,9,67};

		//��������һ�����Կ���ֱ�ӻ�ȡ������Ԫ�ظ�����length.
		//ʹ�÷�ʽ����������.length = 
		//System.out.println("length:"+arr.length);

		//int sum = 0;
		/*
		for(int x=0; x<arr.length; x++)
		{
			//sum += arr[x];
			System.out.println("arr["+x+"]="+arr[x]+";");//arr[0]=0;
		}
		*/
		
		//System.out.println(arr);

		printArray(arr);
//		printArray(arr);

	}

	//���幦�ܣ����ڴ�ӡ�����е�Ԫ�ء�Ԫ�ؼ��ö��Ÿ�����
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+", ");
			else
				System.out.println(arr[x]+"]");

		}		
	}
}
