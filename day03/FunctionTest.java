/*
1������һ�����ܣ����ڴ�ӡ���Ρ�

2������һ����ӡ99�˷����ܵĺ�����

*/

class  FunctionTest
{
	public static void main(String[] args) 
	{
//		draw(5,6);
//		printHr();
//		draw(7,9);
//		printHr();

		print99();
		

	}

	/*
	����һ����ӡ99�˷����ܵĺ�����
	*/
	public static void print99()
	{
		for(int x=1; x<=9; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}

	
	/*
	����һ�����ܣ����ڴ�ӡ���Ρ�
	˼·��
	1��ȷ�������û�У���Ϊֱ�Ӵ�ӡ�����Է���ֵ������void
	2����δ֪�������У���������Ϊ���ε��к��в�ȷ����
	*/
	public static void draw(int row,int col)
	{
		for(int x=0; x<row; x++)
		{
			for(int y=0; y<col; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printHr()
	{
		System.out.println("------------------------------");
	}

}
