/*
��ϰ��3000�׳������ӣ�ÿ���һ�롣�ʶ�����������ӻ�С��5�ף�������С����

*/
class  ForTest4
{
	public static void main(String[] args) 
	{
		int day = 0;
		for(int x=3000; x>=5; x/=2)
		{
			day++;
		}
		System.out.println("day="+day);

		/*
		for(int x=3000; x>=5; day++)
		{
			x = x/2;
		}
		*/
	}
}
