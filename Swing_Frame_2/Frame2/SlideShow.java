
package Frame2 ;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FrameSlideShow extends JFrame
{
    private Dimension size ;
    private Container c ;
    private Font fnt ;
    private CardLayout cl ;
    private ImageIcon icn1 , icn2 , icn3 , icn4 ;
    
    private JLabel l1 ,l2 , l3 , l4 ;
    private JButton next , previous ;
    private JPanel p ;
    
    class Action implements ActionListener
    {
        @Override
        public void actionPerformed (ActionEvent e)
        {
            if (e.getSource() == next)
            {
                cl.next(p);
            }
            else if (e.getSource() == previous)
            {
                cl.previous(p);
            }
        }
    }
    Action act = new Action() ;
    
    FrameSlideShow ()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Slide Show");
        
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
        
        cl = new CardLayout() ;
        c.setLayout(null);
    }
    
    void addComponant ()
    {
        fnt = new Font ("Times New Roman",Font.BOLD,20) ;
        
        icn1 = new ImageIcon(getClass().getResource("1.jpg")) ;
        icn2 = new ImageIcon(getClass().getResource("2.jpg")) ;
        icn3 = new ImageIcon(getClass().getResource("3.jpg")) ;
        icn4 = new ImageIcon(getClass().getResource("4.jpg")) ;
        
        p = new JPanel() ;
        p.setBounds(300,20,500,400);
        p.setLayout(cl);
        c.add(p) ;
        
        l1 = new JLabel(icn1) ;
        l2 = new JLabel(icn2) ;
        l3 = new JLabel(icn3) ;
        l4 = new JLabel(icn4) ;
        
        p.add(l1) ;
        p.add(l2) ;
        p.add(l3) ;
        p.add(l4) ;
        
        
        previous = new JButton("Previous");
        previous.setBounds(300,450,200,60);
        previous.setFont(fnt);
        c.add(previous) ;
        previous.addActionListener(act);
                
        next = new JButton("Next");
        next.setBounds(600,450,200,60);
        next.setFont(fnt);
        c.add(next) ;
        next.addActionListener(act);
    }
}