import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UseKeyEvent extends JApplet implements KeyListener
{

	String msg="HIII ";
	public void init()
	{
		addKeyListener(this);
		System.out.println("inside init");
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		System.out.println("inside paint");
		g.drawString(msg,50,50);
	}

	public void keyReleased(KeyEvent e)
	{
		msg="key released";
		System.out.println("inside relase");
		repaint();
	}
	public void keyPressed(KeyEvent e){
	char ch=e.getKeyChar();
	msg=ch+" key pressed";
	System.out.println("insidepressed");
	repaint();
	showStatus("key pressed");
	}
	public void keyTyped(KeyEvent e){
	msg="key typed";
	System.out.println("inside typed");
	repaint();
	}


}
