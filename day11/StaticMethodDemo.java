
/*
���ͬ����������̬���κ�ʹ�õ�����ʲô�أ�

ͨ����֤�����ֲ�����this����Ϊ��̬������Ҳ�����Զ���this��

��̬���ڴ��ǣ��ڴ���û�б�����󣬵���һ���и����Ӧ���ֽ����ļ�����
����.class  �ö����������Class


��̬��ͬ��������ʹ�õ����Ǹ÷�����������ֽ����ļ����� ����.class
*/
class Ticket implements Runnable
{
	private static  int tick = 100;
	//Object obj = new Object();
	boolean flag = true;
	public  void run()
	{
		if(flag)
		{
			while(true)
			{
				synchronized(Ticket.class)
				{
					if(tick>0)
					{
						try{Thread.sleep(10);}catch(Exception e){}
						System.out.println(Thread.currentThread().getName()+"....code : "+ tick--);
					}
				}
			}
		}
		else
			while(true)
				show();
	}
	public static synchronized void show()
	{
		if(tick>0)
		{
			try{Thread.sleep(10);}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+"....show.... : "+ tick--);
		}
	}
}


class  StaticMethodDemo
{
	public static void main(String[] args) 
	{

		Ticket t = new Ticket();

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		t.flag = false;
		t2.start();


	}
}
