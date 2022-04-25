import java.applet.*;
import java.awt.event.*;
import java.awt.*;

/*
<applet code="findoddandevennumber.class" width="800" height="600">
</applet>>
*/

public class findoddandevennumber extends Applet implements ActionListener {
    TextField t1=new TextField(10);
    TextField t2=new TextField(10);
    Label l1=new Label("Enter the number to check = ");
    Label l2=new Label("This number is ");
    Button b=new Button("Check");

    public void init()
    {
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
     if (e.getSource()==b);
        {
            int n1=Integer.parseInt(t1.getText());
            if (n1%2==0)
            {
                t2.setText("even");
            }
            else
                t2.setText("odd");
        }
    }
}
