import java.applet.Applet;
import java.awt.*;
/*
<applet code = "Hello_java.class" height="300" width="300">
</applet>>
 */

public class Hello_java extends Applet {
    String str;

    @Override
    public void init() {
        str=getParameter("Java");
        if (str==null)
            str="Java";
            str="hello"+str;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(str,10,100);
    }
}
