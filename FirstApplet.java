import java.awt.*;
import java.applet.*;
/*
<applet code="FirstApplet.class" width="1024" height="650">
</applet>>
*/

public class FirstApplet extends Applet
{
	public void init()
	{
		setBackground(Color.YELLOW);
	}
	public void paint (Graphics g)
	{
		//setBackground(Color.red);
		Font f1=new Font ("Times New Roman",Font.BOLD,40);
		g.setFont(f1);
		g.drawString("Hello java",550,325);

	}
}