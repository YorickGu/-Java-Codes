
/*
stop�����Ѿ���ʱ��

���ֹͣ�̣߳�
ֻ��һ�֣�run����������
�������߳����У����д���ͨ����ѭ���ṹ��

ֻҪ����סѭ�����Ϳ�����run����������Ҳ�����߳̽�����


���������
���̴߳����˶���״̬��
�Ͳ����ȡ����ǡ���ô�߳̾Ͳ��������

��û��ָ���ķ�ʽ�ö�����ָ̻߳�������״̬�ǣ���ʱ��Ҫ�Զ�����������
ǿ�����ָ̻߳�������״̬�����������Ϳ��Բ���������߳̽�����

Thread���ṩ�÷��� interrupt();



*/
class StopThread implements Runnable
{
	private boolean flag =true;
	public  void run()
	{
		while(flag)
		{
			
			System.out.println(Thread.currentThread().getName()+"....run");
		}
	}
	public void changeFlag()
	{
		flag = false;
	}
}




class  StopThreadDemo
{
	public static void main(String[] args) 
	{
		StopThread st = new StopThread();
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);


		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();

		int num = 0;

		while(true)
		{
			if(num++ == 60)
			{
				//st.changeFlag();
				//t1.interrupt();
				//t2.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"......."+num);
		}
		System.out.println("over");
	}
}
