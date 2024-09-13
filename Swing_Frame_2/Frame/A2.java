
package Frame ;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame2 extends JFrame
{
    private Dimension size ;
    private Container cc ;
    private Font fnt ;
    private ButtonGroup bg ;
    
    private JCheckBox java,c,python ;
    private JLabel l1 ;
    
//    class Action implements ActionListener
//    {
//        @Override
//        public void actionPerformed (ActionEvent e)
//        {
//            if (e.getSource() == java)
//            {
//                l1.setText("You select Java");
//            }
//            else if (e.getSource() == c)
//            {
//                l1.setText("You select C");
//            }
//            else 
//            {
//                l1.setText("You select Python");
//            }
//        }
//    }
//    Action act = new Action () ;
    
    class Item implements ItemListener
    {
        @Override
        public void itemStateChanged (ItemEvent e)
        {
            if (e.getSource() == java)
            {
                l1.setText("tmi java te click korecho.");
            }
            else if (e.getSource() == c)
            {
                l1.setText("tmi C te click korecho.");
            }
            else 
            {
                l1.setText("tmi python a click korecho.");
            }
        }
    }
    Item i = new Item() ;
    
    Frame2 ()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JCheckBox Demo");
        
        size = Toolkit.getDefaultToolkit().getScreenSize() ;
        this.setSize(size.width,size.height);
        
        this.setLocation(0,0);
        
        this.separateContentPane();
        this.addComponant();
        
        this.setVisible(true);
    }
    
    void separateContentPane ()
    {
        cc = this.getContentPane() ;
        cc.setLayout(null);
        cc.setBackground(Color.pink);
    }
    
    void addComponant ()
    {
        fnt = new Font ("Arial",Font.BOLD,19) ;
        
        java = new JCheckBox("Java") ;
        java.setBounds(50,50,100,50);
        java.setFont(fnt);
        java.setBackground(Color.pink);
        java.setSelected(true);
        cc.add(java) ;
//        java.addActionListener(act);
        java.addItemListener(i);
        
        c = new JCheckBox("C") ;
        c.setBounds(50,110,100,50);
        c.setFont(fnt);
        c.setBackground(Color.pink);
        cc.add(c) ;
//        c.addActionListener(act);
        c.addItemListener(i);
        
        python = new JCheckBox("Python") ;
        python.setBounds(50,170,100,50);
        python.setFont(fnt);
        python.setBackground(Color.pink);
        cc.add(python) ;
//        python.addActionListener(act);
        python.addItemListener(i);
        
        bg = new ButtonGroup() ;
        bg.add(java);
        bg.add(c);
        bg.add(python);
        
        l1 = new JLabel("") ;
        l1.setBounds(50,230,300,50);
        l1.setFont(fnt);
        l1.setForeground(Color.green);
        cc.add(l1) ;        
    }
}