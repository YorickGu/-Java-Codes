/*
������ȳ�ʼ������
��Ϊ������ʽ��

Single��һ���ڴ棬���Ѿ��������˶���
class Single
{
	private static Single s = new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	}
}
*/

//�����Ƿ���������ʱ���ų�ʼ����Ҳ�����������ʱ���ء���Ϊ������ʽ��
//Single����ڴ棬����û�д��ڣ�ֻ�е�����getInstance����ʱ���Ž�������
class Single
{
	private static Single s = null;
	private Single(){}
	public static Single getInstance()
	{
		if(s==null)
		{
			synchronized(Single.class)
			{				
				if(s==null)
					s = new Single();
			}
		}
		return s;
	}
}

//��¼ԭ�򣺶��嵥��������ʹ�ö���ʽ��

class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
