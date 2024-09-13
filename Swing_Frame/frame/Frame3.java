package frame;

import java.awt.* ;
import javax.swing.* ;

class Framee extends JFrame {

    private ImageIcon icon1;
    private JLabel label;
    private Container c;

    Framee() {

        this.setBounds(600, 100, 700, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Demo");
        this.getContentPane().setBackground(Color.lightGray);
        
        icon1 = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(icon1.getImage());
        
        this.setVisible(true);
        
        addComponent();

    }

    void addComponent()
    {
        c = this.getContentPane(); //contentPane ta alada korlam 
        c.setLayout(null);
        
        label = new JLabel();
        label.setText("Enter your name : ");
        label.setBounds(50, 20, 200, 200);
        
        //getContentPane().add(label) ;
        
        c.add(label);
    }

}
