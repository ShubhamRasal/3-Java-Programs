import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UseLayoutManager_GUI extends JFrame implements ItemListener
{

	private JLabel lab_name,lab_class,lab_hobbies,lab_info;
	private JCheckBox ch_music,ch_dance,ch_sport;
	private JRadioButton r_fy,r_sy,r_ty;
	private JTextField textname;
	private ButtonGroup btngrp;
	private JPanel pan_north,pan_center,pan_cen_left,pan_cen_right;
	
	public Slip12_1()
	{
		lab_name=new JLabel("Your Name:");
		lab_class=new JLabel("Your Class:");
		lab_hobbies=new JLabel("Your Hobbies");
		
		//radio buttons
		btngrp=new ButtonGroup(); 
	
		r_fy=new JRadioButton("FY");
		r_sy=new JRadioButton("SY");
		r_ty=new JRadioButton("TY");

		btngrp.add(r_fy);
		btngrp.add(r_sy);
		btngrp.add(r_ty);

		//checkbox
		ch_music=new JCheckBox("Music");
		ch_dance=new JCheckBox("Dance");
		ch_sport=new JCheckBox("sport");
		

		//textfield
		textname=new JTextField();
		//label
		lab_info=new JLabel("");
		//lab_info.setBorder();
	
		//add panels for name and textfield 
		pan_north=new JPanel(new GridLayout(1,2));
			//add elements
			pan_north.add(lab_name);
			pan_north.add(textname);
		
		//add panel for radio buttons
		pan_cen_left=new JPanel(new GridLayout(4,1));
			//add elements
			pan_cen_left.add(lab_class);
			pan_cen_left.add(r_fy);
			pan_cen_left.add(r_sy);
			pan_cen_left.add(r_ty);

		//add panel for checkboxes
		pan_cen_right=new JPanel(new GridLayout(4,1));
			//add elemensts
			pan_cen_right.add(lab_hobbies);
			pan_cen_right.add(ch_music);
			pan_cen_right.add(ch_dance);
			pan_cen_right.add(ch_sport);

		// add both pan_left and pan_right to center panel
		pan_center=new JPanel(new GridLayout(1,2));
			pan_center.add(pan_cen_left);
			pan_center.add(pan_cen_right);


		//add itemlistner
		r_fy.addItemListener(this);
		r_sy.addItemListener(this);
		r_ty.addItemListener(this);

		ch_music.addItemListener(this);
		ch_dance.addItemListener(this);
		ch_sport.addItemListener(this);


		setTitle("Your Info");
		setSize(400,300);
		add(pan_north,"North");
		add(pan_center,"Center");
		add(lab_info,"South");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}//const

	public void itemStateChanged(ItemEvent e)
	{
		String Cls="",hbs="";
		String fname=textname.getText();
		
		if(r_fy.isSelected())
		{
		//	lab_info.setText("shubham dharma rasal");
			Cls="FY";	
		}else if(r_sy.isSelected())
		{
			Cls="SY";
		}else if(r_ty.isSelected())
		{
			Cls="TY";
		}

		if(ch_music.isSelected())
		{
			hbs+="Music";
		}
		if(ch_dance.isSelected())
		{
			hbs+="dance";
		}
		if(ch_sport.isSelected())
		{
			hbs+="Sport";
		}

		lab_info.setText("Name:"+fname+"Class:"+Cls+"Hobbies:"+hbs);

	}



	public static void main(String arg[])
	{
		new Slip12_1();
	}
}//class
