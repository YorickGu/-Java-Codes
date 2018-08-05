/*
Map���ϣ��ü��ϴ洢��ֵ�ԡ�һ��һ������档����Ҫ��֤����Ψһ�ԡ�
	1����ӡ�
		put(K key, V value) 
		putAll(Map<? extends K,? extends V> m) 

	2��ɾ����
		clear() 
		remove(Object key) 

	3���жϡ�
		containsValue(Object value) 
		containsKey(Object key) 
		isEmpty() 


	4����ȡ��
		get(Object key) 
		size() 
		values() 

		entrySet() 
		keySet() 

Map
	|--Hashtable:�ײ��ǹ�ϣ�����ݽṹ�������Դ���null��nullֵ���ü������߳�ͬ���ġ�jdk1.0.Ч�ʵ͡�
	|--HashMap���ײ��ǹ�ϣ�����ݽṹ������ʹ�� null ֵ�� null �����ü����ǲ�ͬ���ġ���hashtable�����jdk1.2.Ч�ʸߡ�
	|--TreeMap���ײ��Ƕ��������ݽṹ���̲߳�ͬ�����������ڸ�map�����еļ���������


��Set����
��ʵ��ң�Set�ײ����ʹ����Map���ϡ�


*/
import java.util.*;
class  MapDemo
{
	public static void main(String[] args) 
	{
		Map<String,String> map = new HashMap<String,String>();

		//���Ԫ��,���Ԫ�أ�����������ʱ����ͬ�ļ�����ô����ӵ�ֵ�Ḳ��ԭ�м���Ӧֵ��
		//��put�����᷵�ر����ǵ�ֵ��
		System.out.println("put:"+map.put("01","zhangsan1"));
		System.out.println("put:"+map.put("01","wnagwu"));
		map.put("02","zhangsan2");
		map.put("03","zhangsan3");

		System.out.println("containsKey:"+map.containsKey("022"));
		//System.out.println("remove:"+map.remove("02"));

		System.out.println("get:"+map.get("023"));

		map.put("04",null);
		System.out.println("get:"+map.get("04"));
		//����ͨ��get�����ķ���ֵ���ж�һ�����Ƿ���ڡ�ͨ������null���жϡ�


		
		//��ȡmap���������е�ֵ��
		Collection<String> coll = map.values();

		System.out.println(coll);
		System.out.println(map);


	}
}
