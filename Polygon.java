import java.applet.Applet;
import java.awt.*;
/*
<applet code = "Polygon.class" height="500" width="500">
</applet>>
 */
public class Polygon extends Applet {
    public void paint(Graphics g) {
        int xpoint[]={30,200,30,200};
        int ypoint[]={30,30,200,200};
        int num=4;
        g.drawPolygon(xpoint,ypoint,num);
    }
}
