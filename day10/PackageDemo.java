
package pack;

/*
Ϊ�˼���������д��ʹ��һ���ؼ��֣�import.
import ������ǰ��е��ࡣ
���飬��Ҫдͨ��� * ����Ҫ�õ����е��ĸ��࣬�͵����ĸ��ࡣ



c:\myclass

c:\myclass\packb\DemoA.class
c:\myclass\packb\haha\DemoZ.class

import packb.*;
import packb.haha.*;


������������Ҫ�ظ�������ʹ��url����ɶ��壬url��Ψһ�ġ�

www.itcast.cn

package cn.itcast.demo
package cn.itcast.test


*/

import packb.haha.hehe.heihei.*;
import packa.*;
import packb.*;


class  PackageDemo
{
	public static void main(String[] args) 
	{

		DemoC c = new DemoC();

//		packa.DemoA d = new packa.DemoA();
//		d.show();

//		packb.DemoB d = new packb.DemoB();
//		d.method();
	}
}



/*

PackageDemo.java:8: �Ҳ�������
���ţ� �� DemoA
λ�ã� �� pack.PackageDemo
                DemoA d = new DemoA();
                ^
PackageDemo.java:8: �Ҳ�������
���ţ� �� DemoA
λ�ã� �� pack.PackageDemo
                DemoA d = new DemoA();
                              ^
2 ����

����ԭ������д��

��Ϊ������ȫ���ǣ�����.����




PackageDemo.java:8: ����� packa ������
                packa.DemoA d = new packa.DemoA();
                     ^
PackageDemo.java:8: ����� packa ������
                packa.DemoA d = new packa.DemoA();
                                         ^
2 ����


����ԭ��packa�����ڵ�ǰĿ¼��
��Ҫ����classpath������jvmȥ������ָ����packa����



PackageDemo.java:8: packa.DemoA �� packa �в��ǹ����ģ��޷����ⲿ������ж����
�з���
                packa.DemoA d = new packa.DemoA();
                     ^
PackageDemo.java:8: packa.DemoA �� packa �в��ǹ����ģ��޷����ⲿ������ж����
�з���
                packa.DemoA d = new packa.DemoA();
                                         ^
2 ����

����ԭ�����˰�����Χ���һ�����е���Ҫ�����ʣ�����Ҫ���㹻���Ȩ�ޡ�
���Ա����ʵ���Ҫ��public���Ρ�



PackageDemo.java:9: show() �� packa.DemoA �в��ǹ����ģ��޷����ⲿ������ж����
�з���
                d.show();
                 ^
1 ����

����ԭ���๫�к󣬱����ʵĳ�ԱҲҪ���вſ��Ա����ʡ�





�ܽ᣺
	�����֮����з��ʣ������ʵİ��е����Լ����еĳ�Ա����Ҫpublic���Ρ�

	��ͬ���е����໹����ֱ�ӷ��ʸ����б�protectedȨ�����εĳ�Ա��

�����֮�����ʹ�õ�Ȩ��ֻ�����֣�public  protected��


             public   protected       default     private
ͬһ������     ok         ok             ok          ok
ͬһ������     ok         ok             ok
����           ok         ok             
��ͬ����       ok



java.lang : java�ĺ��İ� jdk1.2�汾�Ժ󣬸ð��е����Զ����롣
java.awt: ��������ͼ�ν��档
java.io:input output  ���ڲ����豸�ϵ����ݡ�
java.util : ���ﶨ����java�Ĺ����ࡣ���ϣ����ڡ�
java.net:��������ͨѶ�ġ�
java.applet:  application  let        server  let    servlet      java server page   jsp  

class haha implements Servlet

class hehe extends HttpServlet

*/