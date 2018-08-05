/*
����Ĳ��Ҳ�����

��ϰ����һ����������飬��Ҫ��һ��Ԫ�ز��뵽�������У�
��Ҫ��֤������������ġ���λ�ȡ��Ԫ���������е�λ�á�

*/
import java.util.*;
class ArrayTest4 
{
	public static void main(String[] args) 
	{
//		int[] arr = {3,2,1,5,4,2,9};
//		int index = getIndex(arr,2);
//		System.out.println("index="+index);

		int[] arr = {2,4,5,7,8,19,32,45};//8

		int index = getIndex_2(arr,190);
		System.out.println("index="+index);
		
//		int x = Arrays.binarySearch(arr,190);//java�ṩ�õ�һ�������۰���ҵĹ��ܡ�����ʱʹ�������
//		System.out.println("x="+x);
		

	}

	public static int getIndex_2(int[] arr,int key)
	{
		int min = 0,max = arr.length-1,mid;

		while(min<=max)
		{
			mid = (max+min)>>1;

			if(key>arr[mid])
				min = mid + 1;
			else if(key<arr[mid])
				max = mid - 1;
			else
				return mid;
		}
		return min;
	}

	/*
	�۰�ĵڶ��ַ�ʽ��
	*/
	public static int halfSearch_2(int[] arr,int key)
	{
		int min = 0,max = arr.length-1,mid;

		while(min<=max)
		{
			mid = (max+min)>>1;

			if(key>arr[mid])
				min = mid + 1;
			else if(key<arr[mid])
				max = mid - 1;
			else
				return mid;
		}
		return -1;
	}
	/*
	�۰���ҡ����Ч�ʣ����Ǳ���Ҫ��֤����������������顣
	*/
	public static int halfSearch(int[] arr,int key)
	{
		int min,max,mid;
		min = 0;
		max = arr.length-1;
		mid = (max+min)/2;

		while(arr[mid]!=key)
		{
			if(key>arr[mid])
				min = mid + 1;
			else if(key<arr[mid])
				max = mid - 1;

			if(min>max)
				return -1;
			mid = (max+min)/2;
		}
		return mid;
	}





	//���幦�ܣ���ȡkey��һ�γ����������е�λ�á����������-1����ô�����key�������в����ڡ�
	public static int getIndex(int[] arr,int key)
	{
		for(int x=0; x<arr.length; x++)
		{
			if(arr[x]==key)
				return x;
		}
		return -1;
	}
}
