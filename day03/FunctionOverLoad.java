/*
ʲôʱ�������أ�
������Ĺ�����ͬ�������������δ֪���ݲ�ͬ��
��ô����ʱ�Ͷ���һ�����������Ա�ʾ���ܣ������Ķ�����ͨ�������б�Ĳ�ͬ�����ֶ��ͬ��������

*/

class FunctionOverload 
{
	public static void main(String[] args) 
	{

//		add(4,5);
//		add(4,5,6);
		print99();

	}
	public static void print99(int num)
	{
		for(int x=1; x<=num; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}

	//��ӡ99�˷���
	public static void print99()
	{
		print99(9);
	}

	//����һ���ӷ����㣬��ȡ���������ĺ͡�
	public static int add(int x,int y)
	{
		return x+y;
	}

	//����һ���ӷ�����ȡ���������ĺ͡�
	public static int add(int x,int y,int z)
	{
		return add(x,y)+z;
	}
}


/*

void show(int a,char b,double c){}

a.
void show(int x,char y,double z){}//û�У���Ϊ��ԭ����һ����

b.
int show(int a,double c,char b){}//���أ���Ϊ�������Ͳ�ͬ��ע�⣺���غͷ���ֵ����û��ϵ��
c.

void show(int a,double c,char b){}//���أ���Ϊ�������Ͳ�ͬ��ע�⣺���غͷ���ֵ����û��ϵ��

d.
boolean show(int c,char b){}//�����ˣ���Ϊ����������ͬ��

e.
void show(double c){}//�����ˣ���Ϊ����������ͬ��

f.
double show(int x,char y,double z){}//û�У�������������Ժ͸�������ͬʱ������һ�����С�


*/
