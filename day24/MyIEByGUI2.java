import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
class  MyIEByGUI2
{
	private Frame f;
	private TextField tf;
	private Button but;
	private TextArea ta;
	
	private Dialog d;
	private Label lab;
	private Button okBut;


	MyIEByGUI2()
	{
		init();
	}
	public void init()
	{
		f = new Frame("my window");
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());

		tf = new TextField(60);

		but = new Button("ת��");

		ta = new TextArea(25,70);


		d = new Dialog(f,"��ʾ��Ϣ-self",true);
		d.setBounds(400,200,240,150);
		d.setLayout(new FlowLayout());
		lab = new Label();
		okBut = new Button("ȷ��");

		d.add(lab);
		d.add(okBut);



		f.add(tf);
		f.add(but);
		f.add(ta);


		myEvent();
		f.setVisible(true);
	}
	private void  myEvent()
	{

		okBut.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				d.setVisible(false);
			}
		});
		d.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				d.setVisible(false);
			}
		});

		tf.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				try
				{
						if(e.getKeyCode()==KeyEvent.VK_ENTER)
					showDir();
				}
				catch (Exception ex)
				{
				}
			
			}
		});


		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					showDir();
				}
				catch (Exception ex)
				{
				}
				
				
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

	private void showDir()throws Exception
	{

		ta.setText("");
		String urlPath = tf.getText();//http://192.168.1.254:8080/myweb/demo.html
		
		URL url = new URL(urlPath);

		URLConnection conn = url.openConnection();
		
		InputStream in = conn.getInputStream();

		byte[] buf = new byte[1024];

		int len = in.read(buf);

		ta.setText(new String(buf,0,len));

	}

	public static void main(String[] args) 
	{
		new MyIEByGUI2();
	}
}
