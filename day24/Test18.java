/*====��ʮ����==================================
��java�У��ַ�����abcd�����ַ�����ab��á��ĳ�����һ���������ĸ��ַ���
����Ӧ���ֽ�����ͬ��һ������ռ�����ֽڡ�
����һ�����������������ֽ�����ȡ�Ӵ���
�磺���ڡ�ab��á������ȡ�����ֽڣ���ô�Ӵ�����ab�롰�㡱�ֵİ����
��ô�����Ҫ���������ȥ�ĸ��ֽھ��ǡ�ab�㡱��ȡ����ֽڻ��ǡ�ab�㡱.


˼·��
���ֵ�Ĭ�ϱ���gbk��
����һ�����������ֽڡ����Ǹ�����
ֻ���ж����һ���ֽ��Ƿ��Ǹ�����
����ǣ�����ǰ�������ж��ٸ����������ż��������������
����������������������һ���ֽڡ�


���裺
1�����ַ�������ֽ����顣
2���������������¼�����ĸ�����
3����ͨ������������ż���ж��Ƿ�������

*/

class  Test18
{
	public static void main(String[] args) 
	{
		String s = cutString("abc���kkлл",7);
		System.out.println(s);
	}	
	public static String cutString(String str,int len)
	{
		byte[] arr = str.getBytes();
		int count = 0;
		for(int x = len-1; x>=0; x--)
		{
			if(arr[x]<0)
			{
				count++;
			}
			else
				break;
		}

		if(count%2==0)
			return new String(arr,0,len);
		else
			return new String(arr,0,len-1);
	}
}
