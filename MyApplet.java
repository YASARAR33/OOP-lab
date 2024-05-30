import java.applet.*;
import java.awt.*;
public class MyApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawOval(200,160,200,160);
		g.drawOval(200,160,200,160);
		g.drawLine(50,400,300,400);
		g.drawRect(20,60,200,40);
	}
}
/*<applet code="MyApplet.class" width=500 height=700 border=2>
</applet>*/
