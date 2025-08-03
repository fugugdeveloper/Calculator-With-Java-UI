
package calculatorform;

import javax.swing.*;
import java.awt.*;


public class AboutDeveloper extends JFrame  {
    JLabel name ;
    JLabel phone;
    JLabel image;
    public AboutDeveloper(){
        name =new JLabel("Developed by:Fandishe Abdurehman");
        phone =new JLabel("Phone :0923955675");
        name.setFont(new Font(Font.SANS_SERIF,Font.BOLD,24));
        name.setForeground(Color.WHITE);
        phone.setForeground(Color.WHITE);
        
        ImageIcon im=new ImageIcon("Icon/developer.jpg");
        image=new JLabel(im);
        phone.setFont(new Font(Font.SANS_SERIF,Font.BOLD,24));
        
        JPanel pane1 =new JPanel();
        pane1.setLayout(new GridLayout(2,1));
        
        pane1.add(name);
        pane1.add(phone);
        JPanel panel1=new JPanel();
        panel1.add(image);
        this.add("North",pane1);
        this.add("Center",image);
        pane1.setBackground(Color.DARK_GRAY);
        this.setSize(500,700);
        this.setLocation(400,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
     
}
