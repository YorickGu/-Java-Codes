package mymenu;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MyMenuTest
{

	private Frame f;
	private MenuBar bar;
	private TextArea ta;
	private Menu fileMenu;
	private MenuItem openItem,saveItem,closeItem;


	private FileDialog openDia,saveDia;

	private File file;
	MyMenuTest()
	{
		init();
	}
	public void init()
	{
		f = new Frame("my window");
		f.setBounds(300,100,650,600);

		bar = new MenuBar();

		ta = new TextArea();

		fileMenu = new Menu("�ļ�");
		
		openItem = new MenuItem("��");
		saveItem = new MenuItem("����");
		closeItem = new MenuItem("�˳�");
		
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(closeItem);
		bar.add(fileMenu);

		f.setMenuBar(bar);


		openDia = new FileDialog(f,"��Ҫ��",FileDialog.LOAD);
		saveDia = new FileDialog(f,"��Ҫ����",FileDialog.SAVE);


		f.add(ta);
		myEvent();

		f.setVisible(true);


	}
	private void myEvent()
	{

		saveItem.addActionListener(new ActionListener()
		{
		
			public void actionPerformed(ActionEvent e)
			{
				if(file==null)
				{
					saveDia.setVisible(true);

					String dirPath = saveDia.getDirectory();
					String fileName = saveDia.getFile();
					if(dirPath==null || fileName==null)
						return ;
					file = new File(dirPath,fileName);
				}

				try
				{
					BufferedWriter bufw  = new BufferedWriter(new FileWriter(file));

					String text = ta.getText();

					bufw.write(text);
					//bufw.flush();
					bufw.close();
				}
				catch (IOException ex)
				{
					throw new RuntimeException();
				}
				
			}
		});


		openItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				openDia.setVisible(true);
				String dirPath = openDia.getDirectory();
				String fileName = openDia.getFile();
//				System.out.println(dirPath+"..."+fileName);
				if(dirPath==null || fileName==null)
					return ;

				ta.setText("");
				file = new File(dirPath,fileName);

				try
				{
					BufferedReader bufr = new BufferedReader(new FileReader(file));

					String line = null;

					while((line=bufr.readLine())!=null)
					{
						ta.append(line+"\r\n");
					}

					bufr.close();
				}
				catch (IOException ex)
				{
					throw new RuntimeException("��ȡʧ��");
				}


			}
		});





		closeItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);	
			}
		});
	}
	
	public static void main(String[] args) 
	{
		new MyMenuTest();
	}
}

/*
�����������˫��ִ�е�jar���أ�
1����������װ����һ����(package)�С�
2������һ��jar����������Ϣ��
	����һ���ļ�a.txt ���ļ���������Ϊ��
	Main-Class:(�ո�)����.����(�س�)
3����jar����
	jar -cvfm my.jar a.txt ����
4��ͨ��winrar���������֤���鿴��jar�������ļ����Ƿ����Զ����������Ϣ��

5��ͨ������--�ļ���ѡ��--�ļ�����--jar�����ļ���ͨ���߼��������jar�����ļ��Ĵ򿪶����Ĺ�������
	jdk\bin\javaw.exe -jar

6��˫�����ԣ���Ŷ�ˡ�



*/
