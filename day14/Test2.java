
/*
"12 0 99 -7 30 4 100 13"
Ҫ����ַ����е���ֵ������������һ����ֵ��С�������ַ�����

"-7 0 4 12 13 30 99 100"

˼·��
1�����ַ����и����ַ������顣
2�����ַ�������ת��int���顣
3��int��������
4����int�������ַ�����

*/
import java.util.*;
class Test2 
{
	public static void main(String[] args) 
	{
		String str = "12 0 99 -7 30 4 100 13";
		str = numberStringSort(str);

		System.out.println(str);
	}
	/**
	
	*/
	public static String numberStringSort(String str)
	{
		String[] arr = splitString(str);
		int[] nums = toIntArray(arr);
		Arrays.sort(nums);
		return intArraytoString(nums);
	}
	/*
	
	*/
	private static String[] splitString(String str)
	{
		return str.split(" ");
	}

	private static int[] toIntArray(String[] arr)
	{
		int[] nums = new int[arr.length];

		for(int x=0; x<arr.length; x++)
		{
			nums[x] = Integer.parseInt(arr[x]);
		}
		return nums;
	}

	private static String intArraytoString(int[] arr)
	{
		StringBuilder sb = new StringBuilder();

		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				sb.append(arr[x]+" ");
			else
				sb.append(arr[x]);
		}
		return sb.toString();
	}
}
