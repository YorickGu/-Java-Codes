/*
��ѧ���͹��˵Ĺ���������ȡ��������������������
ֻҪ��ѧ���͹����뵥��������������й�ϵ���Ϳ����ˡ�

�̳У�
1������˴���ĸ����ԡ�
2����������֮������˹�ϵ�����������ϵ�������˶�̬�����ԡ�


ע�⣺ǧ��ҪΪ�˻�ȡ������Ĺ��ܣ��򻯴�����̳С�
������������֮����������ϵ�ſ��Լ̳С�������ϵ is a��
class C
{
	void demo1(){}
}


class A extends C
{
	//void demo1(){}
	void demo2(){}
}

class B extends C
{
	//void demo1(){}
	void demo3(){}
}

Java�����У�javaֻ֧�ֵ��̳У���֧�ֶ�̳С�

��Ϊ��̳����״�����ȫ����:����������ж�������ͬ���ܣ�
���������ݲ�ͬʱ���������ȷ��Ҫ������һ����
����java�������ֻ��ơ�������һ��������ʽ����ɱ�ʾ����ʵ�֡�


java֧�ֶ��̳С�Ҳ����һ���̳���ϵ

���ʹ��һ���̳���ϵ�еĹ����أ�

��Ҫʹ����ϵ���Ȳ�����ϵ�������������Ϊ�����ж�����Ǹ���ϵ�й��Թ��ܡ�
ͨ���˽⹲�Թ��ܣ��Ϳ���֪������ϵ�Ļ������ܡ�
��ô�����ϵ�Ѿ����Ի���ʹ���ˡ�
��ô�ھ������ʱ��Ҫ����������Ķ���Ϊʲô�أ�
һ����Ϊ�п��ܸ��಻�ܴ�������
���Ǵ�������������ʹ�ø���Ĺ��ܣ�����������Ҳ�������еġ�


��һ�仰�����ĸ��๦�ܣ������������ʹ�ù��ܡ�



class A
{
	void show()
	{
		System.out.println("a");
	}
}
class B
{
	void show()
	{
		System.out.println("b");
	}
}

class C extends A,B
{}

C c = new C();
c.show();

�ۼ���has a

�ۺ�:

��ϣ�




*/

class Person
{
	String name;
	int age;

}
class Student extends Person
{
		void study()
	{
		System.out.println("good study");
	}
}

class Worker extends Person
{
	void work()
	{
		System.out.println("good work");
	}
}



class ExtendsDemo 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.name = "zhagnsan";
	}
}
