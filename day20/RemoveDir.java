

/*
ɾ��һ�������ݵ�Ŀ¼��
ɾ��ԭ��
��window�У�ɾ��Ŀ¼����������ɾ���ġ�

��Ȼ�Ǵ�������ɾ��������Ҫ�õ��ݹ顣



*/
import java.io.*;
class  RemoveDir
{
	public static void main(String[] args) 
	{
		
		File dir = new File("d:\\testdir");
		removeDir(dir);
	}

	public static void removeDir(File dir)
	{
		File[] files = dir.listFiles();
		
		for(int x=0; x<files.length; x++)
		{
			if(files[x].isDirectory())
				removeDir(files[x]);
			else
				System.out.println(files[x].toString()+":-file-:"+files[x].delete());
		}

		System.out.println(dir+"::dir::"+dir.delete());
	}

}


