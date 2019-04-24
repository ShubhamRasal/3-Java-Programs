import javax.swing.*;//japplet
import java.awt.*;
import java.awt.event.*;

public class UseMouseEvent extends JApplet implements MouseListener,MouseMotionListener 
{
	private String msg=" ";
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		
	}//init

	public void paint(Graphics g)
	{
		super.paint(g);
	//	FontMetrics fm=g.getFontMetrics();
		//int w=fm.stringWidth(msg);
	//	int h=fm.getHeight();
	//	int x=(getWidth()-w)/2;
	//	int y=(getHeight()-h)/2;
		g.drawString(msg,50,50);

	}//paint
		
	public void mouseClicked(MouseEvent e)
	{
		msg="mouse clicked";
		repaint();
	}
	public void mouseExited(MouseEvent e)
	{
		msg="mouse exited";
		repaint();
	}
	public void mouseEntered(MouseEvent e){ msg="mouse entered";repaint();}
	public void mouseReleased(MouseEvent e){msg="mouse released";repaint();}
	public void mousePressed(MouseEvent e){msg="mouse pressed";repaint();}
	public void mouseMoved(MouseEvent e){msg="mousemoved";repaint();}
	public void mouseDragged(MouseEvent e){msg="mousedragged";repaint();}





}//class
