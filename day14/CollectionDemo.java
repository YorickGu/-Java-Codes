import java.util.*;

/*
Collection�����˼��Ͽ�ܵĹ��Թ��ܡ�
1�����
	add(e);
	addAll(collection);

2��ɾ��
	remove(e);
	removeAll(collection);
	clear();

3���жϡ�
	contains(e);
	isEmpty();

4����ȡ
	iterator();
	size();

5����ȡ������
	retainAll();

6�����ϱ����顣
	toArray();



1��add�����Ĳ���������Object���Ա��ڽ����������Ͷ���

2�������д洢�Ķ��Ƕ��������(��ַ)


ʲô�ǵ������أ�
��ʵ���Ǽ��ϵ�ȡ��Ԫ�صķ�ʽ��
��ͬץ������Ϸ���еļ��ӡ�

��������ȡ����ʽ����ֱ�ӷ��ʼ����е�Ԫ�ء�
���Խ�������ͨ���ڲ������ʽ������������
ͨ��������iterator()������ȡ���ڲ���Ķ���




*/
class  CollectionDemo
{
	public static void main(String[] args) 
	{
		
		method_get();
	}
	public static void method_get()
	{
		ArrayList al = new ArrayList();

		//1�����Ԫ�ء�
		al.add("java01");//add(Object obj);
		al.add("java02");
		al.add("java03");
		al.add("java04");

		/*
		Iterator it = al.iterator();//��ȡ������������ȡ�������е�Ԫ�ء�

		while(it.hasNext())
		{
			sop(it.next());
		}
		*/

		for(Iterator it = al.iterator(); it.hasNext() ; )
		{
			sop(it.next());
		}
	}


	public static void method_2()
	{
		ArrayList al1 = new ArrayList();

		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");
		ArrayList al2 = new ArrayList();

		al2.add("java03");
		al2.add("java04");
		al2.add("java05");
		al2.add("java06");

		
		//al1.retainAll(al2);//ȥ������al1��ֻ�ᱣ����al2����ͬ��Ԫ�ء�
		al1.removeAll(al2);

		sop("al1:"+al1);
		sop("al2:"+al2);




	}

	public static void base_method()
	{
		//����һ������������ʹ��Collection�ӿڵ����ࡣArrayList
		ArrayList al = new ArrayList();

		//1�����Ԫ�ء�
		al.add("java01");//add(Object obj);
		al.add("java02");
		al.add("java03");
		al.add("java04");

		//��ӡԭ���ϡ�
		sop("ԭ����:"+al);


		//3��ɾ��Ԫ�ء�
		//al.remove("java02");
		//al.clear();//��ռ��ϡ�


		//4���ж�Ԫ�ء�
		sop("java03�Ƿ����:"+al.contains("java03"));
		sop("�����Ƿ�Ϊ�գ�"+al.isEmpty());


		//2����ȡ���������ϳ��ȡ�
		sop("size:"+al.size());

		//��ӡ�ı��ļ��ϡ�
		sop(al);

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
