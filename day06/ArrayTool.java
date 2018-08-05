/*
��̬��Ӧ�á�

ÿһ��Ӧ�ó����ж��й��ԵĹ��ܣ�
���Խ���Щ���ܽ��г�ȡ��������װ��
�Ա㸴�á�


��Ȼ����ͨ������ArrayTool�Ķ���ʹ����Щ���߷�������������в�����
���������⣺
1�����������ڷ�װ���ݵģ�����ArrayTool����δ��װ�������ݡ�
2�����������ÿһ��������û���õ�ArrayTool�����е��������ݡ�

��ʱ�Ϳ��ǣ��ó�����Ͻ����ǲ���Ҫ����ġ�
���Խ�ArrayTool�еķ����������static�ġ�ֱ��ͨ���������ü��ɡ�

����������̬�󣬿��Է�����ʹ�ã����Ǹ��໹�ǿ��Ա���������������ġ�
Ϊ�˸�Ϊ�Ͻ���ǿ���ø��಻�ܽ�������
����ͨ�������캯��˽�л���ɡ�



����������ArrayTool.class�ļ����͸������ˣ�������ֻҪ�����ļ����õ�classpath·���£��Ϳ���ʹ�øù����ࡣ

���ǣ����ź��������е��׶����˶��ٸ��������Է�ȥ���������Ϊ���ಢû��ʹ��˵���顣

��ʼ���������˵���顣java��˵����ͨ���ĵ�ע������ɡ�
*/



/**
����һ�����Զ�������в����Ĺ����࣬�������ṩ�ˣ���ȡ��ֵ������ȹ��ܡ�
@author ����
@version V1.1

*/

//javadoc -d myhelp -author -version ArrayTool.java

public class ArrayTool
{
	/**
	�ղ������캯����
	*/
	private ArrayTool(){}

	/**
	��ȡһ�����������е����ֵ��
	@param arr ����һ��int���͵����顣
	@return �᷵��һ�������������ֵ��
	*/
	public static int getMax(int[] arr)
	{
		int max = 0;
		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]>arr[max])
				max = x;
		}
		return arr[max];
	}
	
	/**
	��ȡһ�����������е���Сֵ��
	@param arr ����һ��int���͵����顣
	@return �᷵��һ������������Сֵ��
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
	/**
	��int�������ѡ������
	@param arr ����һ��int���͵����顣
	*/
	public static void selectSort(int[] arr)
	{
		for (int x=0; x<arr.length-1 ; x++ )
		{
			for(int y=x+1; y<arr.length; y++)
			{
				if(arr[x]>arr[y])
				{
					swap(arr,x,y);
				}
			}
		}
	}
	/**
	��int�������ð������
	@param arr ����һ��int���͵����顣
	*/
	public static void bubbleSort(int[] arr)
	{
		for (int x=0; x<arr.length-1 ; x++ )
		{
			for(int y=0; y<arr.length-x-1; y++)
			{
				if(arr[y]>arr[y+1])
				{
					swap(arr,y,y+1);
				}
			}
		}
	}
	/**
	��������Ԫ�ؽ���λ�õ��û���
	@param arr  ����һ��int���͵����顣
	@param a Ҫ�û���λ�� 
	@param b Ҫ�û���λ�� 
	*/
	private  static void swap(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	/**
	���ڴ�ӡ�����е�Ԫ�ء���ӡ��ʽ�ǣ�[elemet1, element2, ...]
	*/
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



/*
һ������Ĭ�ϻ���һ���ղ����Ĺ��캯����
���Ĭ�ϵĹ��캯����Ȩ�޺�������һ�¡�
����౻public���Σ���ôĬ�ϵĹ��캯��Ҳ��public���η���
�����û�б�public���Σ���ôĬ�ϵĹ��캯����Ҳû��public���Ρ�

Ĭ�Ϲ��칹�캯����Ȩ�������ŵ���ı仯���仯�ġ�


*/



















/*
class Demo
{
	public static void main(String[] args)
	{
		int[] arr = {3,4,1,8};
	

		int max = getMax(arr);
		System.out.println("max="+max);
	}
	public static int getMax(int[] arr)
	{
		int max = 0;
		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]>arr[max])
				max = x;
		}
		return arr[max];
	}
}

class Test
{
	public static int getMax(int[] arr)
	{
		int max = 0;
		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]>arr[max])
				max = x;
		}
		return arr[max];
	}
}
*/