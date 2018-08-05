/*
map���ϵ�����ȡ����ʽ��
1��Set<k> keySet����map�����еļ����뵽Set���ϡ���Ϊset�߱���������
	���п��Ե�����ʽȡ�����еļ����ڸ���get��������ȡÿһ������Ӧ��ֵ��
		

	Map���ϵ�ȡ��ԭ����map����ת��set���ϡ���ͨ��������ȡ����


2��Set<Map.Entry<k,v>> entrySet����map�����е�ӳ���ϵ���뵽��set�����У�
				�������ϵ���������;��ǣ�Map.Entry

				Entry��ʵ����Map�е�һ��static�ڲ��ӿڡ�
				ΪʲôҪ�������ڲ��أ�
				��Ϊֻ������Map���ϣ����˼�ֵ�ԣ��Ż��м�ֵ��ӳ���ϵ��
				��ϵ����Map�����е�һ���ڲ����
				���Ҹ�������ֱ�ӷ���Map�����е�Ԫ�ء�



*/

import java.util.*;


class MapDemo2 
{
	public static void main(String[] args) 
	{
		Map<String,String> map = new HashMap<String,String>();

		map.put("02","zhangsan2");
		map.put("03","zhangsan3");
		map.put("01","zhangsan1");
		map.put("04","zhangsan4");

		//��Map�����е�ӳ���ϵȡ�������뵽Set�����С�
		Set<Map.Entry<String,String>> entrySet = map.entrySet();

		Iterator<Map.Entry<String,String>> it = entrySet.iterator();

		while(it.hasNext())
		{
			Map.Entry<String,String> me = it.next();
			String key = me.getKey();
			String value = me.getValue();

			System.out.println(key+":"+value);

		}

		/*
		//�Ȼ�ȡmap���ϵ����м���Set����,keySet();
		Set<String> keySet = map.keySet();

		//����Set���ϡ��Ϳ��Ի�ȡ���������
		Iterator<String> it = keySet.iterator();

		while(it.hasNext())
		{
			String key = it.next();
			//���˼�����ͨ��map���ϵ�get������ȡ���Ӧ��ֵ��
			String value  = map.get(key);
			System.out.println("key:"+key+",value:"+value);
		}

		*/

	}
}


/*
Map.Entry ��ʵEntryҲ��һ���ӿڣ�����Map�ӿ��е�һ���ڲ��ӿڡ�




interface Map
{
	public static interface Entry
	{
		public abstract Object getKey();
		public abstract Object getValue();

	}
}

class HashMap implements Map
{
	class Hahs implements Map.Entry
	{
		public  Object getKey(){}
		public  Object getValue(){}
	}
	
}
*/