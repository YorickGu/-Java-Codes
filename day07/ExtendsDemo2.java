/*
�Ӹ�����ֺ����Ա���ص㣺

���г�Ա��
1��������
2��������
3�����캯����

1,����
��������г��ַ�˽�е�ͬ����Ա����ʱ��
����Ҫ���ʱ����еı�������this
����Ҫ���ʸ����е�ͬ����������super��

super��ʹ�ú�this��ʹ�ü���һ�¡�
this������Ǳ����������á�
super������Ǹ����������á�





*/

class Fu 
{
	private int num = 4;
	public void setNum(int num)
	{
		this.num =num;
	}
	public int getNum()
	{
		return this.num;
	}
}

class Zi extends Fu
{
	//int num = 5;
	void show()
	{
		System.out.println(num);
	}
}

class  ExtendsDemo2
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		z.show();
		//System.out.println(z.num+"...."+z.num);
	}
}
