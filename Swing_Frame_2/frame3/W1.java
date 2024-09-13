
package frame3 ;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class Fram1 extends JFrame
{
    private Dimension size ;
    private Container c ; 
    private Font fnt ;
    
    private JTextField rf , bf ;
    private JLabel rl , bl , pl ;
    private JSlider rs , bs ;
    private JPanel p ;
    
    class Listener implements ChangeListener
    {

        @Override
        public void stateChanged(ChangeEvent e) 
        {
                int red = rs.getValue() ;
                int blue = bs.getValue() ;
                
                rf.setText(""+red);              
                bf.setText(""+blue);
                
                Color cl = new Color(red,0, blue) ;
                p.setBackground(cl);
        }
        
    }
    
    Listener act = new Listener() ;
        
    Fram1 ()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JSlider Demo"); 
        
        size = Toolkit.getDefaultToolkit().getScreenSize() ;
        this.setSize(size.width , size.height);
        
        this.setLocation(0,0);
        
        this.separateContentPane();
        this.addComponant();
        
        this.setVisible(true);
    }
    
    void separateContentPane()
    {
        c = this.getContentPane() ;
        c.setLayout(null);
        c.setBackground(Color.pink);
    }
    
    void addComponant ()
    {
        fnt = new Font ("Arial",Font.BOLD,20) ;
        
        rl = new JLabel("Red") ;
        rl.setBounds(50,50,50,30);
        rl.setFont(fnt);
        c.add(rl) ;
        
        bl = new JLabel("Blue") ;
        bl.setBounds(50,90,50,30);
        bl.setFont(fnt);
        c.add(bl) ;
        
        rs = new JSlider(0,200,0) ;
        rs.setBounds(110,50,200,30);
        c.add(rs) ;
        rs.addChangeListener(act);
        
        bs = new JSlider(0,200,0) ;
        bs.setBounds(110,90,200,30);
        c.add(bs) ;
        bs.addChangeListener(act);
        
        rf = new JTextField() ;
        rf.setBounds(320,50,50,30);
        rf.setHorizontalAlignment(JTextField.CENTER);
        c.add(rf) ;
        
        bf = new JTextField() ;
        bf.setBounds(320,90,50,30);
        bf.setHorizontalAlignment(JTextField.CENTER);
        c.add(bf) ;
        
        p = new JPanel() ;
        p.setBounds(380,50,200,200);
        c.add(p) ;
        
        pl = new JLabel("Preview") ;
        pl.setBounds(450,260,100,50);
        pl.setFont(fnt);
        c.add(pl) ;
    }
}