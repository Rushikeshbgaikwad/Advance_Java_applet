import java.applet.Applet;
import java.awt.*;
/*
<applet code = "Simple_applet.class" height="400" width="400">
</applet>>
 */

public class Simple_applet extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawString("Simple Applet",20,20);
    }
}
