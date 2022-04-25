import java.applet.Applet;
import java.awt.*;
/*
<applet code = "Line.class" height="500" width="500">
</applet>>
 */

public class Line extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawLine(0,0,100,100);
        g.drawLine(0,100,100,0);
        g.drawLine(40,25,250,180);
        g.drawLine(5,290,80,19);

    }
}
