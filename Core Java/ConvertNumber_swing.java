import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConvertNumber_swing extends JFrame implements ActionListener
{
	private JLabel labDec,labBin,labBinAns,labOct,labOctAns,labHex,labHexAns;
	private JButton btncal,btnclear;
	private JTextField textDec;

	public Slip6_1()
	{
		setSize(450,200);
		setLayout(new GridLayout(5,2));
		
		//setBounds(0,0,500,500);
		
		labDec=new JLabel("Decimal Number");
		labBin=new JLabel("Binary Number");
		labOct=new JLabel("Ocatl Number");
		labHex=new JLabel("HExadecimal Number");

		//for ans
		labBinAns=new JLabel("");
		labOctAns=new JLabel("");
		labHexAns=new JLabel("");

		//for input 
		textDec=new JTextField("");

		//buttons
		btncal=new JButton("Calculate");
		btnclear=new JButton("Clear");
		
		//add component
		add(labDec);
		add(textDec);	
		add(labBin);
		add(labBinAns);	
		add(labOct);
		add(labOctAns);
		add(labHex);
		add(labHexAns);
		add(btncal);
		add(btnclear);
	
		//set action listener to buttons
		btncal.addActionListener(this);
		btnclear.addActionListener(this);	


		//make frame visible
		setVisible(true);

		//set default close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//const


	public static void main(String arg[])
	{
		JFrame sobj=new Slip6_1();

		
	}//main

	public void  actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btncal)
		{
			int num=Integer.parseInt(textDec.getText());
			labBinAns.setText(Integer.toBinaryString(num));
			labOctAns.setText(Integer.toOctalString(num));
			labHexAns.setText(Integer.toHexString(num));	
			
			System.out.println("cal");
		}else if(e.getSource()==btnclear)
		{
			textDec.setText("");
			labBinAns.setText("");
			labOctAns.setText("");
			labHexAns.setText("");
			System.out.println("clear");
		}
	
	
	
	}

}//class
