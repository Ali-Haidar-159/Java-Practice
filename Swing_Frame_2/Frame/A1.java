
package Frame ;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame1 extends JFrame
{
    private Dimension size ;
    private Container c ; 
    private Font fnt ;
    private ButtonGroup bg ;
    
    private JRadioButton male , female ;
    private JTextArea ta ;
    
    class Action implements ActionListener 
    {
        @Override
        public void actionPerformed (ActionEvent e)
        {
            if (male.isSelected())
            {
                ta.setText("You selected Male");
            }
            else 
            {
                ta.setText("You selected Female");
            }
        }
    }
    Action act = new Action () ;
    
    Frame1 ()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Demo");
        
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
        c.setLayout(null);
        c.setBackground(Color.pink);
    }
    
    void addComponant ()
    {
        fnt = new Font ("Times New Roman",Font.BOLD,22) ;
        
        male = new JRadioButton("Male") ;
        male.setBounds(50,50,100,50);
        male.setFont(fnt);
        male.setBackground(Color.pink);
        male.setSelected(true);
        c.add(male) ;
        male.addActionListener(act);
        
        female = new JRadioButton("Female") ;
        female.setBounds(160,50,100,50);
        female.setFont(fnt);
        female.setBackground(Color.pink);
        //female.setEnabled(false);
        c.add(female) ;
        female.addActionListener(act);
        
        
        bg = new ButtonGroup() ;
        bg.add(male);
        bg.add(female);
        
        ta = new JTextArea() ;
        ta.setBounds(50,110,400,300);
        ta.setFont(fnt);
        ta.setForeground(Color.red);
        c.add(ta) ;
    }
}