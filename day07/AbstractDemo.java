/*
��������г�����ͬ���ܣ����ǹ������岻ͬ��
���ǿ��Խ������ϳ�ȡ����ʱ��ֻ��ȡ���ܶ��壬������ȡ�������塣

���󣺿�������

��������ص㣺
1�����󷽷�һ���ڳ������С�
2�����󷽷��ͳ����඼���뱻abstract�ؼ������Ρ�
3�������಻������new����������Ϊ���ó��󷽷�û���塣
4���������еĳ��󷽷�Ҫ��ʹ�ã����������ิд�����еĳ��󷽷��󣬽������������á�
	�������ֻ�����˲��ֳ��󷽷�����ô�����໹��һ�������ࡣ


�������һ����û��̫��Ĳ�ͬ��
������������������������ֻ�����������������һЩ�������Ķ�����
��Щ��ȷ���Ĳ��֣�Ҳ�Ǹ�����Ĺ��ܣ���Ҫ��ȷ���֡������޷��������塣
ͨ�����󷽷�����ʾ��

�������һ�������˳����������������п��Զ�����󷽷���
�����಻����ʵ������


���⣺�������п��Բ�������󷽷��������������ǲ��ø��ཨ������


��ϰ��

abstract �ؼ��֣�����Щ�ؼ��ֲ��ܹ��档
final����final���ε��಻�������ࡣ����abstract���ε���һ����һ�����ࡣ
private: �������е�˽�еĳ��󷽷�������������֪�����޷�����д��
		�����󷽷����ֵľ�����Ҫ����д��
static�����static�������γ��󷽷�����ô������ʡ�ˣ�ֱ���������þͿ����ˡ�
		���ǳ��󷽷�����û���塣



���������Ƿ��й��캯����
�У���������һ�����࣬Ҫ�������ṩʵ���ĳ�ʼ����

*/

abstract class Student
{
	abstract final void study();
	//abstract void study1();
	void sleep()
	{
		System.out.println("����");
	}
}
/*

class ChongCiStudent extends Student
{
	void study()
	{
		System.out.println("chongci study");
	}
}

class BaseStudent extends Student
{
	void study()
	{
		System.out.println("base study");
	}
}

class AdvStudent extends Student
{
	void study()
	{
		System.out.println("adv study");
	}
}
*/
class AbstractDemo 
{
	public static void main(String[] args) 
	{
		//new Student();
		//new BaseStudent().study();
	}
}
