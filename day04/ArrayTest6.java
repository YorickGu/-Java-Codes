class ArrayTest6 
{
	public static void main(String[] args) 
	{
//		toHex(60);
		toBin(-6);
	}

	public static void toBin(int num)
	{
		//��������Ƶı�
		char[] chs = {'0','1'};

		//����һ����ʱ�洢������
		char[] arr = new char[32];

		//����һ�����������ָ��
		int pos = arr.length;

		while(num!=0)
		{
			int temp = num & 1;

			arr[--pos] = chs[temp];

			num = num >>> 1;
		}

		for(int x=pos; x<arr.length; x++)
		{
			System.out.print(arr[x]);
		}
	}


	/*
		0 1 2 3 4 5 6 7 8 9 A  B  C   D  E  F  ==ʮ�������е�Ԫ�ء�
		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15

		����������е�Ԫ����ʱ�洢������������Ӧ��ϵ��
		ÿһ��&15���ֵ��Ϊ����ȥ�齨���õı��Ϳ����Ҷ�Ӧ��Ԫ�ء�
		������ -10+'a'�򵥵Ķࡣ

		�������ô�����أ�
		����ͨ�����ݵ���ʽ�����塣

		�������ڳ�����ˡ������Ƿ��ŵġ���Ҫ�������أ�����ͨ��StringBuffer reverse��������ɡ�
		����������߻�û��ѧϰ��

		���Կ���ʹ���Ѿ�ѧϰ������������������ɴ洢����

	*/

	public static void toHex(int num)
	{
		char[] chs = {'0','1','2','3'
					,'4','5','6','7'
					,'8','9','A','B'
					,'C','D','E','F'};
		
		//����һ����ʱ������
		char[] arr = new char[8];
		int pos = arr.length;

		while(num!=0)
		{
			int temp = num & 15;
			
			//System.out.println(chs[temp]);
			arr[--pos] = chs[temp];
			

			num = num >>> 4;
		}
		System.out.println("pos="+pos);
		//�洢���ݵ�arr���������
		for(int x=pos;x<arr.length; x++)
		{
			System.out.print(arr[x]+",");
		}

	}
}
