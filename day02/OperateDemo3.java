class OperateDemo3 
{
	public static void main(String[] args) 
	{

		//System.out.println(Integer.toBinaryString(60));
		//System.out.println(Integer.toHexString(60));
		
		int num = 26;

		//��ȡ60�����4λ��ͨ��&15;
		int n1 = num & 15;

		System.out.println(n1>9?(char)(n1-10+'A'):n1);


		//Ҫ��ȡ��һ����λ����60����4λ��
		int temp = num >>> 4;

		//��temp��ֵ���������λ�Ļ�ȡ��
		int n2 = temp & 15;
		System.out.println(n2>9?(char)(n2-10+'A'):n2);

		/*
		0-9 'A' 'B' 'C' 'D' 'E' 'F'
			65   66  67
			10   11  12  13  14  15

			12 - 10 = 2 + 'A' = (char)67;
		*/

		int x = 1,y;

		y = (x>1)?'a':200;
		System.out.println("y="+y);
	}
}
