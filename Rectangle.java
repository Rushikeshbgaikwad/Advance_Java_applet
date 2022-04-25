import java.applet.Applet;
import java.awt.*;
/*
<applet code = "Rectangle.class" height="500" width="500">
</applet>>
 */

public class Rectangle extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawRect(10,10,60,50);
        g.fillRect(100,100,100,50);
        g.drawRoundRect(10,100,60,50,15,15);
        g.fillRoundRect(100,10,60,50,15,15);
    }
}
