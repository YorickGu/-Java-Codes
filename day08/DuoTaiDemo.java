/*
��̬���������Ϊ������ڵĶ���������̬��

�ˣ����ˣ�Ů��

���è������

è x = new è();

���� x = new è();

1����̬������
	���������ָ�����Լ����������
	���������Ҳ���Խ����Լ����������
2����̬��ǰ��
	������������֮���й�ϵ��Ҫô�̳У�Ҫôʵ�֡�
	ͨ������һ��ǰ�᣺���ڸ��ǡ�

3����̬�ĺô�
	��̬�ĳ��ִ�����߳������չ�ԡ�

4����̬�ı׶ˣ�
	�������չ�ԣ�����ֻ��ʹ�ø�������÷��ʸ����еĳ�Ա��

5����̬��Ӧ��



*/

/*
���
è������
*/

abstract class Animal
{
	abstract void eat();

}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void catchMouse()
	{
		System.out.println("ץ����");
	}
}


class Dog extends Animal
{
	public void eat()
	{
		System.out.println("�Թ�ͷ");
	}
	public void kanJia()
	{
		System.out.println("����");
	}
}


class Pig extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void gongDi()
	{
		System.out.println("����");
	}
}

//-----------------------------------------


class DuoTaiDemo 
{
	public static void main(String[] args) 
	{
		//Cat c = new Cat();
		//c.eat();

		//Dog d = new Dog();
		//d.eat();
		//Cat c = new Cat();
		/*
		Cat c1 = new Cat();
		function(c1);

		function(new Dog());
		function(new Pig());
		*/

		//Animal c = new Cat();
		//c.eat();

		
		function(new Cat());
		function(new Dog());
		function(new Pig());
		

		
	}
	public static void function(Animal a)//Animal a = new Cat();
	{
		a.eat();
		//a.catchMouse();
	}
	/*
	public static void function(Cat c)//
	{
		c.eat();
	}
	public static void function(Dog d)
	{
		d.eat();
	}

	public static void function(Pig p)
	{
		p.eat();
	}
	*/

}
