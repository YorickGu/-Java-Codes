
/*
�����������Ͷ����װ�ࡣ

byte	Byte
short	short
int		Integer
long	Long
boolean Boolean
float	Float
double	Double
char	Character



�����������Ͷ����װ���������ã�
�������ڻ����������ͺ��ַ�������֮����ת��

������������ת���ַ�����

	������������+""

	������������.toString(������������ֵ);

	�磺 Integer.toString(34);//��34�������"34";


�ַ���ת�ɻ����������͡�

	xxx a = Xxx.parseXxx(String);

	int a = Integer.parseInt("123");

	double b = Double.parseDouble("12.23");

	boolean b = Boolean.parseBoolean("true");

	Integer i = new Integer("123");

	int num = i.intValue();

	


ʮ����ת���������ơ�
	toBinaryString();
	toHexString();
	toOctalString();


��������ת��ʮ���ơ�
	parseInt(string,radix);


*/
class IntegerDemo 
{
	public static void sop(String str)
	{
		System.out.println(str);
	}
	
	public static void main(String[] args) 
	{
		//�������͵����ֵ��
		//sop("int max :"+Integer.MAX_VALUE);

//		��һ���ַ���ת��������

		int num = Integer.parseInt("123");//���봫�����ָ�ʽ���ַ�����
		//long x = Long.parseLong("123");

//		sop("num="+(num+4));

//		sop(Integer.toBinaryString(-6));
//		sop(Integer.toHexString(60));

		int x = Integer.parseInt("3c",16);

		sop("x="+x);


	}
}
