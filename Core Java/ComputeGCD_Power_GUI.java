import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ComputeGCD_Power_GUI extends JFrame implements ActionListener
{

	private JMenuBar menubar;
	private JMenu menu1,menu2;
	private JMenuItem menu1_1,menu1_2,menu2_1,menu2_2;
	private JSeparator sep;
	public int num1[]=new int[2];


	public Slip22_1()
	{
		menubar=new JMenuBar();

		//crate menu
		menu1=new JMenu("Operation");
		menu2=new JMenu("compute");

		//create menuitem
		menu1_1=new JMenuItem("Accepet");
		menu1_2=new JMenuItem("Exit");
		menu2_1=new JMenuItem("GCD");
		menu2_2=new JMenuItem("Power");

		//crreate separator
		sep=new JSeparator();

		//add menuitems
		menu1.add(menu1_1);
		menu1.add(sep);
		menu1.add(menu1_2);

		menu2.add(menu2_1);
		menu2.add(menu2_2);

		// add both menus to menbar
		menubar.add(menu1);
		menubar.add(menu2);

		setLayout(null);
		setSize(300,300);
		setJMenuBar(menubar);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//add ActionListener
		menu1_1.addActionListener(this);
		menu1_2.addActionListener(this);
		menu2_1.addActionListener(this);
		menu2_2.addActionListener(this);

	}//cost

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==menu1_1)
		{
			int cnt=1;
			while(cnt<=2)
			{
			
	String no=JOptionPane.showInputDialog(this,"Enter "+cnt+" Number");
	
			try{
			if(no!=null)
			{			
			num1[cnt-1]=Integer.parseInt(no);
			System.out.println(num1[cnt-1]);
			cnt++;
			}else
			{
				break;// input sialog returns null on cancel
			}
			
			}catch(Exception eobj)
			{
			}
			}
			System.out.println("Accepet");
		
		}
		else if(e.getSource()==menu1_2)
		{
			System.out.println("Exit");
			System.exit(1);
		}
		else if(e.getSource()==menu2_1)
		{
			int gcd=0;
			for(int i=1;i<num1[0] && i<num1[1];i++)
			{
				if((num1[0]%i)==0 && (num1[1]%i)==0)
				{
					gcd=i;
				}
			}

			JOptionPane.showMessageDialog(this,"GCD: "+gcd);



			System.out.println("GCD");
		}
		else if(e.getSource()==menu2_2)
		{
			int ans=(int)Math.pow(num1[0],num1[1]);
			JOptionPane.showMessageDialog(this,"Power : "+ans);
			System.out.println("Power");
		}



	}

	public static void main(String arg[])
	{
		new Slip22_1();
	}
}




