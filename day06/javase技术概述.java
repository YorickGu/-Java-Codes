class  Demo
{

	Demo(int x)
	{}
	void show()
	{}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Demo d = new Demo(4);
		d.show();
		d.show();

		Phone p = new Phone();
		p.setNumber(88888888);


	}
}

class Phone
{
	int number;
	Phone()
	{
		number = 51552112;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}
}



/*
1��java�﷨(��������䣬����������)��
2���������(��Ͷ���Ĺ�ϵ����װ��������£����̳У���̬�����캯����this��static���ڲ��࣬�����࣬�ӿ�)
3�����̡߳�
4��JavaApi����ʵ����java�������ṩ���Ѿ�����õĶ��󡣹��߶��󣺼��Ͽ�ܣ�
5���������(IO)
6��java��ͼ�ν��档--�¼��������ơ�
7������ͨѶ��Socket

web����֪ʶ��
1��HTML��
2��CSS
3��JavaScript
4��DOM��

*/