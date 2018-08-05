import java.util.*;
/*
�Ը��������������
{5,1,6,4,2,8,9}


*/
class ArrayTest2 
{

	/*
	ѡ������
	��ѭ������һ�Σ���ֵ����ͷ�Ǳ�λ���ϡ�
	*/
	public static void selectSort(int[] arr)
	{
		for (int x=0; x<arr.length-1 ; x++)
		{
			for(int y=x+1; y<arr.length; y++)
			{
				if(arr[x]>arr[y])
				{
					/*
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y]= temp;
					*/
					swap(arr,x,y);
				}
			}
		}
	}
	/*
	ð������
	*/

	public static void bubbleSort(int[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{									
			for(int y=0; y<arr.length-x-1; y++)//-x:��ÿһ�αȽϵ�Ԫ�ؼ��٣�-1������Ǳ�Խ�硣
			{
				if(arr[y]<arr[y+1])
				{
					/*
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
					*/
					swap(arr,y,y+1);
				}
			}
		}
	}

	/*
	��������ʲô���򡣶���Ҫ������������Ԫ�ؽ���λ���û���
	���Կ��԰��ⲿ����ͬ�Ĵ�����ȡ������������װ��һ��������
	*/
	public static void swap(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static void main(String[] args)
	{
		int[] arr = {5,1,6,4,2,8,9};
		//����ǰ��
		printArray(arr);

		//����
		//selectSort(arr);
		//bubbleSort(arr);

		//Arrays.sort(arr);//java���Ѿ�����õ�һ������ʽ�������У�����������Ҫʹ�øþ���롣
		//�����
		printArray(arr);
			
	}

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
