/*


MyReader//ר�����ڶ�ȡ���ݵ��ࡣ
	|--MyTextReader
		|--MyBufferTextReader
	|--MyMediaReader
		|--MyBufferMediaReader
	|--MyDataReader
		|--MyBufferDataReader

class MyBufferReader
{
	MyBufferReader(MyTextReader text)
	{}
	MyBufferReader(MyMediaReader media)
	{}
}
�����������չ�Ժܲ
�ҵ�������Ĺ�ͬ���͡�ͨ����̬����ʽ�����������չ�ԡ�

class MyBufferReader extends MyReader
{
	private MyReader r;
	MyBufferReader(MyReader r)
	{}
}	


MyReader//ר�����ڶ�ȡ���ݵ��ࡣ
	|--MyTextReader
	|--MyMediaReader
	|--MyDataReader
	|--MyBufferReader


��ǰ��ͨ���̳н�ÿһ�����඼�߱����幦�ܡ�
��ô�̳���ϵ�Ḵ�ӣ�����������չ��

�����Ż�˼�롣��������һ�»������ݡ�
����Ҫ������Ķ��󡣴��ݽ�����Ҳ���ǣ�˭��Ҫ�����壬˭����Ϊ�������ݸ���������
�����̳���ϵ�ͱ�úܼ򵥡��Ż�����ϵ�ṹ��





װ��ģʽ�ȼ̳�Ҫ�������˼̳���ϵӷ�ס�
���ҽ�����������֮��Ĺ�ϵ��

װ������Ϊ��ǿ���ж��󣬾߱��Ĺ��ܺ����е�����ͬ�ģ�ֻ�����ṩ�˸�ǿ���ܡ�
����װ����ͱ�װ����ͨ���Ƕ�����һ����ϵ�еġ�




*/


class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
