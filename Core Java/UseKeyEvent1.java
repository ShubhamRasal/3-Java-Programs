import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
class UseKeyEvent1 extends JApplet implements MouseListener,MouseMotionListener,KeyListener
{
String x=" ";
TextField t1=new TextField(25);
Slip19Prog1()
{
this.add(t1);
}
public void init()
{
t1.addKeyListener(this);
this.add(t1);
this.addMouseListener(this);
this.addMouseMotionListener(this);
}
public void paint(Graphics g)
{
g.drawString(x,150,100);
}
public void keyTyped(KeyEvent ke)
{
x="Key Typed";
t1.setText(""+ke.getKeyChar());
repaint();
}
public void keyPressed(KeyEvent ke)
{
x="Key Pressed";
repaint();
}
public void keyReleased(KeyEvent ke)
{
x="Key Released";
repaint();
}
public void mouseMoved(MouseEvent me)
{
x="Mouse Moved";
repaint();
}
public void mouseDragged(MouseEvent me)
{
x="Mouse Dragged";
repaint();
}
public void mouseEntered(MouseEvent me)
{
x="Mouse Entered";
repaint();

}
public void mouseExited(MouseEvent me)
{
x="Mouse Exited";
repaint();
}
public void mousePressed(MouseEvent me)
{
x="Mouse Pressed";
repaint();
}
public void mouseReleased(MouseEvent me)
{
x="Mouse Released";
repaint();
}
public void mouseClicked(MouseEvent me)
{
x="Mouse Clicked";
repaint();
}
}
/*
<applet code="Slip19Prog1.class" width=600 height=600>
</applet>
*/
