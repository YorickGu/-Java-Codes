class Array2Demo 
{
	public static void main(String[] args) 
	{
//		int[] arr = new int[3];//һά���顣

		//int[][] arr = new int[3][4];//����������Ϊarr�Ķ�ά���顣��ά��������3��һά���顣
									//ÿһ��һά���������ĸ�Ԫ�ء�

		//System.out.println(arr[0][1]);
		
		/*
		int[][] arr  = new int[3][];

		arr[0] = new int[3];
		arr[1] = new int[1];
		arr[2] = new int[2];


		System.out.println(arr.length);//��ӡ�Ƕ�ά����ĳ��� 3��
		System.out.println(arr[0].length);//��ӡ��ά�����е�һ��һά���鳤��
		*/

		int[][] arr = {{3,5,1,7},{2,3,5,8},{6,1,8,2}};

		int sum = 0;
		for(int x=0; x<arr.length;x++)
		{
			for(int y=0; y<arr[x].length; y++)
			{
				sum = sum + arr[x][y];
			}
		}

		System.out.println("sum="+sum);
	}
}
/*
int[] x; int x[];
int[][] y; int y[][]; int[] y[];


int[] x,y[];//xһά��y��ά��
int[] x;
int[] y[];

a.
x[0] = y;//error

b.
y[0] = x;//yes

c.
y[0][0] = x;//error

d.
x[0][0] = y;//error

e.
y[0][0] = x[0];//yes

f.
x=y;//error
*/