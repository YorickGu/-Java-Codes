class OperateDemo2 
{
	public static void main(String[] args) 
	{

		int x  = 7;

		//�߼��������������boolean���͵ı��ʽ��

		//x>3 & x<6 = true & true = true;
		/*
		true & true = true;
		true & false = false;
		false & true = false;
		false & false = false;

		& : ֻҪ���ߵ�boolean���ʽ�������һ��Ϊfalse����ô�������false��
			ֻ�����߶�Ϊtrue�����Ϊtrue��
		*/
		/*
		true | true = true;
		true | false = true;
		false | true = true;
		false | false = false;
		| : ����ֻҪ��һ��Ϊtrue�����Ϊtrue��
			ֻ�����߶���false�����Ϊfalse��
		*/

		/*
		^ : ��򣻾��Ǻ�|�е㲻һ������true ^ true = false;
		true ^ true = false;
		true ^ false = true;
		false ^ true = true;
		false ^ false = false;
		^ : ������ͬ�����false��
			���߲�ͬ�����true��

		*/

		/*
		!!true
		*/

		
		int a = 2;

		//a>3 && a<6;

		/*
		&��&&���ص㣺
		&:���������true��false���ұ߶����㡣
		&&:�����Ϊfalseʱ���ұ߲����㡣


		|�����߶��������㡣
		||�������Ϊtrue���ұ߲����㡣
		*/



		System.out.println(false ^ false);
		System.out.println(~6);


		int n = 3,m = 8;
		System.out.println("n="+n+",m="+m);
		
		//1,ͨ��������������
		/*int temp;
		temp = n;
		n = m;
		m = temp;
		*/

		//2���õ�����������
		//11 = 3 +  8;

		//3 = 11 - 8;
		//8 = 11 - 3;
		/*
		n = n + m;//���n��m��ֵ�ǳ������׳���int��Χ��
		m = n - m;
		n = n - m;
		*/

		n = n ^ m;

		m = n ^ m;//(n^m)^m;

		n = n ^ m;//n ^ (n ^ m)

		System.out.println("n="+n+",m="+m);
	}
}
