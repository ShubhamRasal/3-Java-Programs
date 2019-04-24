import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.io.FileWriter;
//i
//mport java.awt.BorderLayout;

public class Sort_Swing extends JFrame implements ActionListener
{

	private JMenuBar menubar;
	private JMenu menu1;
	private JMenu menu2;
	private JMenuItem menu1_1;
	private JMenuItem menu1_2;
	private JMenuItem menu1_3;
	private JMenuItem menu2_1;
	private JMenuItem menu2_2;
	private JSeparator jline=new JSeparator();
	private JLabel Num;
	private JLabel values;
	public int array[]=new int[10];// array for values 

	public Slip2_11()
	{
		getContentPane().setLayout(null);
		setBounds(0,0,500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create menubar
		menubar=new JMenuBar();
		//set menubar
		setJMenuBar(menubar);
		
		//create main menu-option
		menu1=new JMenu("Operation");
		menu2=new JMenu("Sort");

		//add menu1 in menubar
		menubar.add(menu1);
		menubar.add(menu2);

		//create menu items
		menu1_1=new JMenuItem("Load");
		menu1_2=new JMenuItem("Save");
		menu1_3=new JMenuItem("Exit");

		menu2_1=new JMenuItem("Ascending");
		menu2_2=new JMenuItem("Desending");

		//add menuitems in menu
		menu1.add(menu1_1);
		menu1.add(menu1_2);
		menu1.add(jline);
		menu1.add(menu1_3);

		// for sort opt
		menu2.add(menu2_1);
		menu2.add(menu2_2);
			
		//add label for Numbers and values
		Num=new JLabel("Numbers");
		Num.setBounds(10,50,80,25);

		values=new JLabel(":");
		values.setBounds(80,50,300,25);
	
		//add label into pane
		getContentPane().add(Num);
		getContentPane().add(values); 

		//add action listener for all JMenuItems
		menu1_1.addActionListener(this);
			menu1_2.addActionListener(this);
			menu1_3.addActionListener(this);
			menu2_1.addActionListener(this);
			menu2_2.addActionListener(this);

	}



	public static void main(String args[])
	{
		JFrame jf=new Slip2_11();
		jf.setVisible(true);

	}


    public void actionPerformed(ActionEvent e)
    {
	 	String str="";
	    Random random=new Random();
   if(e.getSource()==menu1_1)
        {
         for(int i=0;i<array.length;i++)
	{
		array[i]=random.nextInt(100);
		str=str+" "+array[i];
	}	
		values.setText(str);
	//System.out.println("load");
        }else if(e.getSource()==menu1_2)
        {
		try{
			System.out.println(values.getText()+"<-str");
			File f=new File("numbers.txt");
			FileWriter fw= new FileWriter(f);
			str=values.getText();
			fw.write(str);
			fw.close();
		}
		catch(Exception eobj){}
        System.out.println("save");
        }else if(e.getSource()==menu1_3)
        {
                System.out.println("Exit");
                System.exit(1);
        }else if(e.getSource()==menu2_1)
        {
		Arrays.sort(array);
                str=" ";
		for(int i=0;i<array.length;i++)
		{
			str=str+" "+array[i];
		}
		values.setText(str);
		System.out.println("Asc");
		
        }else if(e.getSource()==menu2_2)
        {
		Arrays.sort(array);
		str=" ";
		int brr[]=new int[array.length];
		for(int i=array.length-1,j=0;i>=0;i--,j++)
		{
			brr[j]=array[i];
			str=str+" "+brr[j];	
		}
		values.setText(str);
                System.out.println("Desc");
        }
  

   }

}//class closed
