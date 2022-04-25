import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
<applet code="findprimenumber.class" width="800" height="600">
</applet>>
*/

public class findprimenumber extends Applet implements ActionListener {
    TextField t1=new TextField(10);
    TextField t2=new TextField(10);
    Label l1=new Label("Enter the number to check = ");
    Label l2=new Label("This number is = ");
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
         if (e.getSource()==b) {
             int i = 1, count = 0, n1 = Integer.parseInt(t1.getText());
             {
             for (i = 1; i <= n1; i++)
             {
                 if (n1 % i == 0)

                     count += 1;
                     {
             if (count == 2)

                 t2.setText("Prime number");

             else

                 t2.setText("Composite number");
                     }
                 }
             }
         }
    }
}

