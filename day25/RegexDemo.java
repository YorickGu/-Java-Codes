/*
������ʽ:����һ������ı��ʽ��
	���ã�����ר�Ų����ַ�����
	�ص㣺����һЩ�ض��ķ�������ʾһЩ��������������ͼ���д��
	����ѧϰ������ʽ��������ѧϰһЩ������ŵ�ʹ�á�

	�ô������Լ򻯶��ַ����ĸ��Ӳ�����
	�׶ˣ����Ŷ���Խ�࣬����Խ�����Ķ���Խ�


����������ܣ�

1��ƥ�䣺String  matches�������ù���ƥ�������ַ�����ֻҪ��һ�������Ϲ��򣬾�ƥ�����������false��

2���иString split();

3���滻��String replaceAll(regex,str);���regex���ж����飬�����ڵڶ�������ͨ��$���Ż�ȡ������ʽ�е����е��顣
*/

class  RegexDemo {
	public static void main(String[] args) {
		//demo();
		//System.out.println((char)11);
//		checkTel();

		//splitDemo("zhangsan.lisi.wangwu","\\.");
		//splitDemo("c:\\abc\\a.txt","\\\\");

		//splitDemo("erkktyqqquizzzzzo","(.)\\1+");//���յ�������иΪ�˿����ù���Ľ��������
		//���Խ������װ��һ���顣��()��ɡ���ĳ��ֶ��б�š�
		//��1��ʼ�� ��Ҫʹ�����е������ͨ��  \n(n������ı��)����ʽ����ȡ��

		String str = "wer1389980000ty1234564uiod234345675f";//���ַ����е������滻��#��

		//replaceAllDemo(str,"\\d{5,}","#");

		String str1 = "erkktyqqquizzzzzo";//�������滻��$.  //���ص����ַ��滻�ɵ�����ĸ��zzzz->z
		replaceAllDemo(str1,"(.)\\1+","$1");


	}

	public static void replaceAllDemo(String str,String reg,String newStr) {
		str = str.replaceAll(reg,newStr);

		System.out.println(str);
	}



	public static void splitDemo(String str,String reg) {

		//String reg = " +";//���ն���ո��������и�
		String[] arr = str.split(reg);
		System.out.println(arr.length);
for(String s : arr) {
			System.out.println(s);
		}
	}




	/*
	ƥ��
	�ֻ��Ŷ�ֻ�� 13xxx 15xxx 18xxxx

	*/
	public static void checkTel() {
		String tel = "16900001111";
		String telReg = "1[358]\\d{9}";
		System.out.println(tel.matches(telReg));
	}

	public static void demo() {
		String str = "b23a23456789";

		String reg = "[a-zA-Z]\\d*";

		boolean b= str.matches(reg);
		System.out.println(b);
	}
	public static void checkQQ() {
		String qq = "123a454";

		String regex = "[1-9]\\d{4,14}";

		boolean flag = qq.matches(regex);
		if(flag)
			System.out.println(qq+"...is ok");
		else
			System.out.println(qq+"... ���Ϸ�");

	}


	/*
	��QQ�������У��
	Ҫ��5~15  0���ܿ�ͷ��ֻ��������

	���ַ�ʽ��ʹ����String���еķ��������������������󡣵��Ǵ�����ڸ��ӡ�

	*/

	public static void checkQQ_1() {
		String qq = "1882345a0";

		int len = qq.length();

		if(len>=5 && len<=15) {
			if(!qq.startsWith("0")) { //Integer.parseInt("12a");NumberFormatException
				try {
					long l = Long.parseLong(qq);
					System.out.println("qq:"+l);
				} catch (NumberFormatException e) {
					System.out.println("���ַǷ��ַ�.......");
				}

				/*
				char[] arr = qq.toCharArray();//123a4
				boolean flag = true;
				for(int x=0;x<arr.length; x++)
				{
					if(!(arr[x]>='0' && arr[x]<='9'))
					{
						flag = false;
						break;
					}
				}
				if(flag)
				{
					System.out.println("qq:"+qq);
				}
				else
				{
					System.out.println("���ַǷ��ַ�");
				}
				*/
			} else {
				System.out.println("������0��ͷ");

			}
		} else {
			System.out.println("���ȴ���");
		}
	}
}
