/*
Object:�����ж����ֱ�Ӻ��߼�Ӹ��࣬��˵�е��ϵۡ�
�����ж���Ŀ϶������ж��󶼾߱��Ĺ��ܡ�



Object�����Ѿ��ṩ�˶Զ����Ƿ���ͬ�ıȽϷ�����

����Զ�������Ҳ�бȽ���ͬ�Ĺ��ܣ�û�б�Ҫ���¶��塣
ֻҪ��Ϯ�����еĹ��ܣ������Լ����бȽ����ݼ��ɡ�����Ǹ��ǡ�
*/

class Demo //extends Object
{
	private int num;
	Demo(int num)
	{
		this.num = num;
	}
	
	public boolean equals(Object obj)//Object obj = new Demo();
	{

		if(!(obj instanceof Demo))
			return false;
		Demo d = (Demo)obj;

		return this.num == d.num;
	}
	
	/*
	public boolean compare(Demo d)
	{
		return this.num==d.num;
	}
	*/
	public String toString()
	{
		return "demo:"+num;
	}


}
class Person 
{
}


class ObjectDemo 
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo(4);
		System.out.println(d1);//�������ӡ����ʱ�����Զ����ö����toString��������ӡ������ַ���������ʽ��
		Demo d2 = new Demo(7);
		System.out.println(d2.toString());
		//Demo d2 = new Demo(5);
		//Class c = d1.getClass();
//
//		System.out.println(c.getName());
//		System.out.println(c.getName()+"@@"+Integer.toHexString(d1.hashCode()));
//		System.out.println(d1.toString());
		//Person p = new Person();
		///System.out.println(d1.equals(p));

	}
}



