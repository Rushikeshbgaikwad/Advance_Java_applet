import java.applet.Applet;
import java.awt.*;
/*
<applet code = "color_rect.class" width="500" height="500">
</applet>
 */
public class color_rect extends Applet {
    public void paint(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.drawRect(50,75,150,150);
    }
}
