import javax.swing.*;
import java.awt.*;//for fonts
import java.awt.event.*;//for itemlistner

public class UseFonts_GUI extends JFrame implements ItemListener
{
	private JLabel lab_font,lab_size,lab_style;
	private JComboBox c_font,c_size;
	private JCheckBox ch_bold,ch_italic;
	private JTextField text;
	private	int val_italic=Font.PLAIN,val_bold=Font.PLAIN;
	public Slip8_11()
	{
		lab_font=new JLabel("Font");
		lab_size=new JLabel("Size");
		lab_style=new JLabel("Style");

		String fname[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		//combobox
		c_font=new JComboBox();
		for(int i=0;i<fname.length;i++)
			c_font.addItem(fname[i]);
	//	c_font.addItem("");
       //	c_font.addItem("Arial");
	//	c_font.addItem("Verdana");
	//	c_font.addItem("Georgia");
	//	c_font.addItem("Courier");


		c_size=new JComboBox();
	//	c_size.addItem(" ");
		c_size.addItem("10");
		c_size.addItem("20");

		//checkbox
		ch_bold=new JCheckBox("Bold");
		ch_italic=new JCheckBox("Italic");
		
		text=new JTextField();


		//setbounds
		lab_font.setBounds(10,10,80,80);
		c_font.setBounds(10,100,80,30);
		lab_size.setBounds(10,150,80,80);
		c_size.setBounds(10,200,80,30);
		
		text.setBounds(10,300,280,80);	
	
		lab_style.setBounds(200,10,80,80);	
		ch_bold.setBounds(200,90,80,20);
		ch_italic.setBounds(200,150,80,20);

	
		// add elements
		add(lab_font);
		add(lab_style);
		add(c_font);
		add(lab_size);
		add(c_size);
		add(text);
		add(ch_bold);
		add(ch_italic);
		//add itemlistener
		c_font.addItemListener(this);
		c_size.addItemListener(this);
		ch_bold.addItemListener(this);
		ch_italic.addItemListener(this);

		setLayout(null);
		//setSize(500,500);
		setBounds(0,0,500,500);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	//abstract method for event handling
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==c_font)
		{      change();
		//	System.out.println("in size");
		}else if(e.getSource()==c_size)
		{	change();
		//	System.out.println("in font");
		}else if(e.getSource()==ch_bold)
		{
			if(ch_bold.isSelected())
			{
				val_bold=Font.BOLD;
			}else
			{
				val_bold=Font.PLAIN;
			}
			change();
		//	System.out.println("inside bold");
		}else if(e.getSource()==ch_italic)
		{
			if(ch_italic.isSelected())
			{
				val_italic=Font.ITALIC;
			}else
			{
				val_italic=Font.PLAIN;
			}
			change();
		//	System.out.println("inside italic");
		}


	}//itemStateChanged



	public void change()
	{
	String fontname=c_font.getSelectedItem().toString();

	int fontsize=Integer.parseInt(c_size.getSelectedItem().toString());
	text.setFont(new Font(fontname,val_bold+val_italic,fontsize));
	System.out.println(fontname+" \t"+fontsize);
	}//change


	public static void main(String args[])
	{
//	System.out.println("inside main");
	Slip8_11 sobj=new Slip8_11();
	}//main


}



