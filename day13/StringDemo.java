class StringDemo 
{
	public static void main(String[] args) 
	{
		/*
		String s1 = "abc";//s1��һ�������ͱ����� "abc"��һ������
						//�ַ�������ص㣺һ������ʼ���Ͳ����Ա��ı䡣

		String s2 = new String("abc");

		//s1��s2��ʲô����
		//s1���ڴ�����һ������
		//s2���ڴ�������������
		




		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));//String�ิд��Object����equals������
										//�÷��������ж��ַ����Ƿ���ͬ��

		*/

		String s = "abcde";
		method_1(s);
	}

	/*
	String���Ƕ��ַ��������������
	���ඨ����ר�����ڲ����ַ����ķ�����
	"abc":
	*/

	public static void method_1(String s)
	{
		char ch = s.charAt(3);

		System.out.println("ch="+ch);
		int num = s.codePointAt(3);

		System.out.println("num="+num);

		String s1 = "qq";
		s1 = s1.concat("mm");

		System.out.println("s1="+s1);
		System.out.println("qq"+"mm");

		String a = "opq";
		String b = "opq";
		System.out.println("a==b:"+(a==b));


	}
}
