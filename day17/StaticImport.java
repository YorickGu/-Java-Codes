
/*
StaticImport  ��̬���롣

����������ʱ����Ҫָ������İ�����
�����������ǣ�ָ���߱������Ķ�������ࡣ
*/

import java.util.*;
import static  java.util.Arrays.*;//�������Arrays������е����о�̬��Ա��
import static java.util.Collections.*;
/*
packa/Demo.class 
packb/Demo.class

import packa.*;
import packb.*;
*/

import static  java.lang.System.*;//������System�������о�̬��Ա��

class  StaticImport //extends Object
{
	public static void main(String[] args) 
	{

		out.println("haha");
		int[] arr = {3,1,5};

		sort(arr);
		int index = binarySearch(arr,1);
		out.println(Arrays.toString(arr));
		System.out.println("Index="+index);

		ArrayList al = new ArrayList();
		al.add(1);
		al.add(3);
		al.add(2);

		out.println(al);

		sort(al);
		out.println(al);
	}
}
