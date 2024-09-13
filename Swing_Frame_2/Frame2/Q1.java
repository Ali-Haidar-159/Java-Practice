
package Frame2 ;

import java.awt.*;
import javax.swing.*;

class Frame1 extends JFrame
{
    private Dimension size ;
    private Container c ; 
    private Font fnt ;
    
    private JButton b1 , b2 , b3 , b4 ;
    
    Frame1 ()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("layout manager demo");
        
        size = Toolkit.getDefaultToolkit().getScreenSize() ;
        this.setSize(size.width,size.height);
        
        this.setLocation(0,0);
        
        this.separateContentPane();
        this.addComponant();
        
        this.setVisible(true);
        
    }
    
    void separateContentPane ()
    {
        c = this.getContentPane() ;
        c.setBackground(Color.PINK);
        
        GridLayout gl = new GridLayout(2,2) ;
        
        c.setLayout(gl);
    }
    
    void addComponant ()
    {
        b1 = new JButton("Ali_1");
        
        b2 = new JButton("Ali_2");
        
        b3 = new JButton("Ali_3");
        
        b4 = new JButton("Ali_4");
        
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4) ;
        
    }
}