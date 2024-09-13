
package Frame ;

import java.awt.*;
import javax.swing.*;

class Frame4 extends JFrame
{
    private Dimension size ;
    private Container c ;
    private Font fnt ;
    
    Frame4 ()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JPanel Demo");
        
        size = Toolkit.getDefaultToolkit().getScreenSize() ;
        this.setSize(size.width , size.height);
        
        this.setLocation(0,0);
        
        this.separateContentPane();
        this.addComponant();
        
        this.setVisible(true);
    }
    
    void separateContentPane ()
    {
        c = this.getContentPane() ;
        c.setLayout(null);
        c.setBackground(Color.pink);
    }
    
    void addComponant ()
    {
        fnt = new Font ("Arial",Font.BOLD,25) ;
        
        JPanel p1 = new JPanel() ;
        p1.setBounds(20,20,600,700);
        c.add(p1) ;
        
        JPanel p2 = new JPanel() ;
        p2.setBounds(700,20,600,700);
        c.add(p2) ;
        

        JButton b = new JButton("Submit") ;
        b.setFont(fnt);
        
        JButton b2 = new JButton("Clear") ;
        b2.setFont(fnt);
       
        p1.add(b) ;
        p2.add(b2) ;
        
    }
}