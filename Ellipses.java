import java.applet.Applet;
import java.awt.*;
/*
<applet code = "Ellipses.class" height="500" width="500">
</applet>>
 */

public class Ellipses extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawOval(10,10,65,50);
        g.drawOval(190,10,90,30);
        g.fillOval(100,10,75,50);
        g.fillOval(70,90,140,100);
    }
}
