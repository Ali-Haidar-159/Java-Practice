
package Frame ;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame3 extends JFrame
{
    private Container cc ;
    private Font fnt ;
    
    private JComboBox cb ;
    private JLabel l1 ;
    
    String [] elements = {"Bangla" , "English" , "Math"} ;
    
    class Action implements ActionListener 
    {
        @Override
        public void actionPerformed (ActionEvent e)
        {
            String s = cb.getSelectedItem().toString() ;
                
            l1.setText("You selected : "+s);
        }
    }
    Action act = new Action () ;
    
    
    Frame3 ()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500,175,600,400);
        this.setTitle("ComboBox Demo");
        
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
        fnt = new Font ("Arial",Font.BOLD,18) ;
        
        cb = new JComboBox(elements) ;
        cb.setBounds(100,50,300,50);
        cb.setFont(fnt);
        cb.addItem("java");
        cb.addItem("C");
        cb.addItem("C++");
        cb.addItem("PHP");
        cc.add(cb) ;
        cb.addActionListener(act);
        
        l1 = new JLabel() ;
        l1.setText("You have to select one item");
        l1.setBounds(100,110,400,50);
        l1.setFont(fnt);
        cc.add(l1) ;
    }
    
}