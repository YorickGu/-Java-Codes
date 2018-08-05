class MyThread extends Thread{
	public void run(){
		try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("MyThread running");
	}
}



public class ThreadTest{
	public static void main(String argv[]) {
		MyThread t = new MyThread();
		t.run();
		t.start();
		System.out.println("Thread Test");
	  }
}

/*
����������̣�

MyThread t = new MyThread();
������һ���̡߳�

t.run();
����MyThread�����run������
����ֻ��һ���߳������о������̡߳�
�����߳�ִ�е���run�����е�sleep(3000);ʱ��
�������̴߳��ڶ���״̬������û���κ�ִ�С�
��3��������̴߳�ӡ��  MyThread running�� run����ִ�н�����

t.start();
������t�̡߳�
�����ֿ��������
��һ�֣����߳���ִֻ����t.start()�󣬻�����ִ��Ȩ����������ִ�У�
��ӡ��Thread Test�����߳̽�����
t�̻߳�ȡִ��Ȩ�������Լ���run������Ȼ��ִ�е�sleep(3000);����3�롣
3��󣬴�ӡMyThread running t�߳̽������������������

�ڶ��������
���߳�ִ�е�t.start();������t�̣߳�t�߳̾�ֱ�ӻ�ȡ����ִ��Ȩ��
�͵����Լ���run������
ָ����sleep(3000).t�̶߳���3�룬����t�߳̾����ͷ���ִ��Ȩ��
��ô���߳̿�ʼִ�д�ӡ��Thread Test�����߳̽�����
�ȵ�3���t�̴߳�ӡMyThread running ��Ȼ��t�߳̽�����
���������







*/

