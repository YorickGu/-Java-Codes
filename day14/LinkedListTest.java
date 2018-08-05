/*
ʹ��LinkedListģ��һ����ջ���߶������ݽṹ��

��ջ���Ƚ����  ��ͬһ�����ӡ�
���У��Ƚ��ȳ� First in First out  FIFO ��ͬһ��ˮ�ܡ�



*/

import java.util.*;
class DuiLie
{
	private LinkedList link;

	DuiLie()
	{
		link = new LinkedList();
	}
	
	public void myAdd(Object obj)
	{
		link.addFirst(obj);
	}
	public Object myGet()
	{
		return link.removeFirst();
	}
	public boolean isNull()
	{
		return link.isEmpty();
	}

}



class  LinkedListTest
{
	public static void main(String[] args) 
	{
		DuiLie dl = new DuiLie();
		dl.myAdd("java01");
		dl.myAdd("java02");
		dl.myAdd("java03");
		dl.myAdd("java04");

		while(!dl.isNull())
		{
			System.out.println(dl.myGet());
		}
	}
}
