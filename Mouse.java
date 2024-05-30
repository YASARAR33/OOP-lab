import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Mouse extends Applet implements MouseListener
{
	int x=0;
	int y=0;
	String msg="";
	public void init()
	{
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		x=20;
		y=40;
		msg="Mouse Clicked";
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		x=30;
		y=60;
		msg="Mouse Pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		x=30;
		y=60;
		msg="Mouse Released";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		x=40;
		y=80;
		msg="Mouse Entered";
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		x=40;
		y=80;
		msg="Mouse Exited";
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		showStatus("Currently mouse dragged"+x+" "+y);
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Handling Mouse Events",60,40);
		g.setColor(Color.red);
		g.drawString(msg,100,80);
	}
}
/*<applet code="Mouse.class" width=300 height=300>
</applet>*/

