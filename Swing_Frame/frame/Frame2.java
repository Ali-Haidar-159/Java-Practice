
package frame ;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

class Frame extends JFrame
{
    private ImageIcon icon ;
    private Container c ;
            
    Frame ()
    {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 200, 500, 500);
        
        this.setIcon();
    }
    
    void setIcon ()
    {
        c = this.getContentPane() ;
        c.setBackground(Color.gray); 
        
        icon = new ImageIcon(getClass().getResource("icon.png")) ;
        this.setIconImage(icon.getImage());
    }
}