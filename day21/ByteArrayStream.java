/*
���ڲ����ֽ������������

ByteArrayInputStream ���ڹ����ʱ����Ҫ��������Դ������������Դ��һ���ֽ����顣

ByteArrayOutputStream�� �ڹ����ʱ�򣬲��ö�������Ŀ�ģ���Ϊ�ö������Ѿ��ڲ���װ�˿ɱ䳤�ȵ��ֽ����顣
���������Ŀ�ĵء�

��Ϊ�����������󶼲��������飬��û��ʹ��ϵͳ��Դ��
���ԣ����ý���close�رա�


�����������ɽ���ʱ��

Դ�豸��
	���� System.in��Ӳ�� FileStream���ڴ� ArrayStream��
Ŀ���豸��
	����̨ System.out��Ӳ��FileStream���ڴ� ArrayStream��


�����Ķ�д˼�����������ݡ�


*/
import java.io.*;
class ByteArrayStream 
{
	public static void main(String[] args) 
	{
		//����Դ��
		ByteArrayInputStream bis = new ByteArrayInputStream("ABCDEFD".getBytes());

		//����Ŀ��
		ByteArrayOutputStream bos = new ByteArrayOutputStream();

		int by = 0;

		while((by=bis.read())!=-1)
		{
			bos.write(by);
		}



		System.out.println(bos.size());
		System.out.println(bos.toString());

	//	bos.writeTo(new FileOutputStream("a.txt"));

	}
}
