
import java.io.*;


/*
1,
Դ������¼�롣
Ŀ�ģ�����̨��

2��������Ѽ���¼������ݴ洢��һ���ļ��С�
Դ�����̡�
Ŀ�ģ��ļ���

3��������Ҫ��һ���ļ������ݴ�ӡ�ڿ���̨�ϡ�
Դ���ļ���
Ŀ�ģ�����̨��

�������Ļ������ɣ�
��ʹ��ľ����������кܶ࣬��֪��������һ����

ͨ��������ȷ����ɡ�

1����ȷԴ��Ŀ�ġ�
	Դ����������InputStream  Reader
	Ŀ�ģ��������OutputStream  Writer��
2�������������Ƿ��Ǵ��ı���
	�ǣ��ַ�����
	���ǣ��ֽ�����

3������ϵ��ȷ������ȷҪʹ���ĸ�����Ķ���
	ͨ���豸���������֣�
	Դ�豸���ڴ棬Ӳ�̡�����
	Ŀ���豸���ڴ棬Ӳ�̣�����̨��

	
1����һ���ı��ļ������ݴ洢����һ���ļ��С������ļ���
	Դ����Ϊ��Դ������ʹ�ö�ȡ����InputStream Reader 
	�ǲ��ǲ����ı��ļ���
	�ǣ���ʱ�Ϳ���ѡ��Reader
	������ϵ����ȷ�ˡ�

	��������ȷҪʹ�ø���ϵ�е��ĸ�����
	��ȷ�豸��Ӳ�̡���һ���ļ���
	Reader��ϵ�п��Բ����ļ��Ķ����� FileReader

	�Ƿ���Ҫ���Ч�ʣ��ǣ�������Reader��ϵ�л����� BufferedReader.


	FileReader fr = new FileReader("a.txt");
	BufferedReader bufr = new BufferedReader(fr);




	Ŀ�ģ�OutputStream Writer
	�Ƿ��Ǵ��ı���
	�ǣ�Writer��
	�豸��Ӳ�̣�һ���ļ���
	Writer��ϵ�п��Բ����ļ��Ķ���FileWriter��
	�Ƿ���Ҫ���Ч�ʣ��ǣ�������Writer��ϵ�л����� BufferedWriter
	
	FileWriter fw = new FileWriter("b.txt");
	BufferedWriter bufw = new BufferedWriter(fw);


��ϰ����һ��ͼƬ�ļ������ݴ洢����һ���ļ��С������ļ���Ҫ�������ϸ�ʽ�Լ����������ȷ��


---------------------------------------

2�����󣺽�����¼������ݱ��浽һ���ļ��С�
	�����������Դ��Ŀ�Ķ����ڡ�
	��ô�ֱ����
	Դ��InputStream Reader
	�ǲ��Ǵ��ı����ǣ�Reader
	
	�豸�����̡���Ӧ�Ķ�����System.in.
	����ѡ��Reader��System.in��Ӧ�Ĳ����ֽ�����
	Ϊ�˲������̵��ı����ݷ��㡣ת���ַ��������ַ������������ġ�
	���Լ�Ȼ��ȷ��Reader����ô�ͽ�System.inת����Reader��
	����Reader��ϵ��ת����,InputStreamReader

	InputStreamReader isr = new InputStreamReader(System.in);

	��Ҫ���Ч������Ҫ��BufferedReader
	BufferedReader bufr = new BufferedReader(isr);



	Ŀ�ģ�OutputStream  Writer
	�Ƿ��Ǵ��ı����ǣ�Writer��
	�豸��Ӳ�̡�һ���ļ���ʹ�� FileWriter��
	FileWriter fw = new FileWriter("c.txt");
	��Ҫ���Ч������Ҫ��
	BufferedWriter bufw = new BufferedWriter(fw);


	**************
	��չһ�£���Ҫ��¼������ݰ���ָ���ı����utf-8���������ݴ浽�ļ��С�
	
	Ŀ�ģ�OutputStream  Writer
	�Ƿ��Ǵ��ı����ǣ�Writer��
	�豸��Ӳ�̡�һ���ļ���ʹ�� FileWriter��
	����FileWriter��ʹ�õ�Ĭ�ϱ����GBK.
	
	���Ǵ洢ʱ����Ҫ����ָ�������utf-8����ָ���ı����ֻ��ת��������ָ����
	����Ҫʹ�õĶ�����OutputStreamWriter��
	����ת��������Ҫ����һ���ֽ�����������һ����Բ������ļ����ֽ��������FileOutputStream

	OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d.txt"),"UTF-8");

	��Ҫ��Ч����Ҫ��
	BufferedWriter bufw = new BufferedWriter(osw);

	���ԣ���ס��ת����ʲôʹ�á��ַ����ֽ�֮���������ͨ�����漰���ַ�����ת��ʱ��
	��Ҫ�õ�ת������


��ϰ����һ���ı����ݴ�ӡ�ڿ���̨�ϡ�Ҫ�������ϸ�ʽ�Լ����������ȷ��



*/

class  TransStreamDemo2
{
	public static void main(String[] args) throws IOException
	{
		System.setIn(new FileInputStream("PersonDemo.java"));

		System.setOut(new PrintStream("zzz.txt"));

		//���̵����д����
		BufferedReader bufr = 
				new BufferedReader(new InputStreamReader(System.in));

		
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

		String line = null;

		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
		}

		bufr.close();

	}
}
