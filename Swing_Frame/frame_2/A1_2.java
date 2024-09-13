
package frame_2 ;

import java.awt.*;
import java.util.Locale;
import javax.swing.*;

class Frame12 extends JFrame
{
    private Dimension size ; 
    private Container c ;
    private Font fnt ; 
    private ImageIcon icon ;    
    
    Frame12 ()
    {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Error Frame");
        
        size = Toolkit.getDefaultToolkit().getScreenSize() ;
        this.setSize(size.width,size.height);
        
        this.setLocation(0,0);
        
        this.separateContentPane();
        this.addComponat();
        
        this.setVisible(true);
    }
    
    void separateContentPane ()
    {
        c = this.getContentPane() ;
        c.setBackground(Color.pink);
        c.setLayout(null);
    }
    
    void addComponat ()
    {
        icon = new ImageIcon(getClass().getResource("icon.jpg")) ;
                
        JLabel l1 = new JLabel(icon) ;
        l1.setBounds(50,50,icon.getIconWidth(),icon.getIconHeight());
        c.add(l1) ;
        
        
    }
}        
