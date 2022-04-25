import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="sumoftwonumber.class" width="1024" height="650">
</applet>>
*/


public class sumoftwonumber extends Applet implements ActionListener {
    TextField t1 =new TextField(10);
    TextField t2 =new TextField(10);
    TextField t3 =new TextField(10);
    Label l1=new Label("First number = ");
    Label l2=new Label("Second number = ");
    Label l3=new Label("sum = ");
    Button b=new Button("ADD");

    public void init()
    {
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==b)
        {
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            t3.setText(""+(n1+n2));
        }
    }
}
