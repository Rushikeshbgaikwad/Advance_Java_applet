import java.applet.Applet;
import java.awt.*;
/*
<applet code = "Sum_of_two_number.class" height="500" width="500">
</applet>>
 */

public class Sum_of_two_number extends Applet {

    public void paint(Graphics g) {
        int a=10;
        int b=20;
        int c=a+b;
        String s=("Addition is = "+String.valueOf(c));
        g.drawString(s,50,50);
    }
}
