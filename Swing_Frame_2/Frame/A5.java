
package Frame ;

import java.awt.*;
import javax.swing.*;

class Frame5 extends JFrame
{
private Dimension size ;
    private Container c ;
    private Font fnt ;
    
    Frame5()
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
        c.setBackground(Color.pink);
//        c.setLayout(null);
        FlowLayout fl = new FlowLayout() ;
        c.setLayout(fl);
        
    }
    
    void addComponant ()
    {
        fnt = new Font ("Arial",Font.BOLD,25) ;
        
        JButton [] buttons  = new JButton[9];
        
        for (int i=0 ; i<9 ; i++)
        {
            buttons[i] = new JButton("ali_"+(i+1)) ;
            buttons[i].setFont(fnt);
            c.add(buttons[i]) ;
        }
    }
}