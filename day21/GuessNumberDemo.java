/*
��������Ϸ��
1�������������
2����ȡ����¼�롣
3����¼�����ݱ�����֣���������Ƚϡ�
	������ʾ��Ϣ��
4���ظ�������̣�������У�����ͽ�����
ע�⣺��������1~100��������֣����Լ�������Ҫ������ʾ��

*/
import java.io.*;
import java.util.*;
class GuessNumber
{
	private int ranNum;
	GuessNumber()
	{
		Random r = new Random();
		ranNum = r.nextInt(100)+1;//(int)Math.random()*100+1;
	}

	public void play()
	{
		System.out.println("��Ϸ��ʼ������1~100֮�������:");
		boolean b = false;
		while(!b)
		{
			try
			{
				int num = getNum();
				if(num>=1 && num<=100)
					b = isLuck(num);
				else
					System.out.println("��ֵ������Χ");
			}
			catch (IOException e)
			{
				throw new RuntimeException("¼������ʧ��");
			}
			catch(NumberFormatException e)
			{
				System.out.println("�����˷Ƿ�����");
			}
			
		}
	}

	//��ȡ���̵�����
	private int getNum()throws IOException,NumberFormatException
	{
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(bufr.readLine());
		return num;

	}

	//��������Ƚ�
	private boolean isLuck(int num)
	{
		boolean b = false;
		if(num>ranNum)
			System.out.println("���ˣ�����");
		else if(num<ranNum)
			System.out.println("С�ˣ�����");
		else
		{
			System.out.println("���ˣ���ϲ");
			b = true;
		}
		return b;

	}
}

class  GuessNumberDemo
{
	public static void main(String[] args) 
	{
		new GuessNumber().play();
	}
}
