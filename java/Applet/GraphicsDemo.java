import java.applet.Applet;
import java.awt.*;

/*
<applet code="GraphicsDemo.class" width="300" height="300">  
</applet> 
*/
public class GraphicsDemo extends Applet
{
    public void paint (Graphics g)
    {
        g.setColor (Color.red);
        g.drawString ("Welcome", 50, 50);
        g.drawLine (20, 30, 20, 300);
        g.drawRect (70, 100, 100, 50);
        g.setColor (Color.black);
        g.fillRect (70, 300, 200, 80);
        g.drawOval (200, 200, 100, 100);
g.fillOval (200, 200, 100, 100);

        g.setColor (Color.green);
        g.fillOval (170, 200, 30, 30);
        g.drawArc (90, 150, 30, 30, 30, 270);
        g.fillArc (270, 150, 30, 30, 0, 180);
    }
}