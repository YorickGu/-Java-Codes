/*
public static void main(String[] args) 

����������һ������ĺ�������Ϊ�������ڣ����Ա�jvm���á�

�������Ķ��壺
public�������Ÿú�������Ȩ�������ġ�
static������������������ļ��ؾ��Ѿ������ˡ�
void��������û�о���ķ���ֵ��
main�����ǹؼ��֣�������һ������ĵ��ʣ����Ա�jvmʶ��
��String[] arr��:�����Ĳ���������������һ�����飬�������е�Ԫ�����ַ������ַ������͵����顣

�������ǹ̶���ʽ�ģ�jvmʶ��

jvm�ڵ���������ʱ���������new String[0];
*/

class MainDemo 
{
	public static void main(String[] args)//new String[]
	{
		String[] arr = {"hah","hhe","heihei","xixi","hiahia"};

		MainTest.main(arr);
	}
}

//String[] args = new String[3];
//String[] args = null;


class MainTest
{
	public static void main(String[] args)
	{
		for(int x=0; x<args.length; x++)
			System.out.println(args[x]);
	}
}