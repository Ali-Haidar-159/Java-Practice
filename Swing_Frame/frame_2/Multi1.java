
package frame_2 ;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FrameMulti extends JFrame
{
    private Dimension size ;
    private ImageIcon icn ;
    private Container c ;
    private Font fnt ;
    private Cursor cur ;
    
    private JLabel imgLabel , textLabel ;
    private JTextField num ;
    private JButton clr ;
    private JTextArea area ;
    
    class Action implements ActionListener 
    {
        @Override
        public void actionPerformed (ActionEvent e)
        {
            if (e.getSource() == num)
            {
                area.setText("");
                int i , r ; 
                int n = Integer.parseInt(num.getText()) ;
                
                for (i=1 ; i<=10 ; i++)
                {
                    r = i * n ;
                    
                    String res = Integer.toString(r) ;
                    String ii = Integer.toString(i) ;
                    
                    
                    area.append(num.getText()+" X "+ii+" = "+res+System.lineSeparator());
                }
            }
            else if (e.getSource() == clr)
            {
                num.setText("");
                area.setText("");
            }
        }
    }
    Action act = new Action () ;
    
    FrameMulti()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Multiplication Table");
        
        size = Toolkit.getDefaultToolkit().getScreenSize() ;
        this.setSize(size.width,size.height);
        
        this.setLocation(0,0);
        
        icn = new ImageIcon(getClass().getResource("m1.jpg")) ;
        this.setIconImage(icn.getImage());
        
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
        icn = new ImageIcon(getClass().getResource("m2.jpg")) ;
        fnt = new Font ("Times New Roman",Font.BOLD,18) ;
        
        imgLabel = new JLabel(icn) ;
        imgLabel.setBounds(300,20,icn.getIconWidth(),icn.getIconHeight());
        c.add(imgLabel) ;
        
        textLabel = new JLabel() ;
        textLabel.setText("Enter any number : ");
        textLabel.setBounds(300,200,200,50);
        textLabel.setFont(fnt);
        c.add(textLabel) ;
        
        num = new JTextField() ;
        num.setBounds(500,200,125,50);
        num.setFont(fnt);
        num.setHorizontalAlignment(JTextField.CENTER);
        c.add(num) ;
        num.addActionListener(act);
        
        clr = new JButton("Clear") ;
        clr.setBounds(500,255,125,50);
        clr.setFont(fnt);
        cur = new Cursor(Cursor.HAND_CURSOR) ;
        clr.setCursor(cur);
        c.add(clr);
        clr.addActionListener(act);
        
        area = new JTextArea() ;
        area.setBounds(300,310,340,400);
        area.setFont(fnt);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        c.add(area) ;
        
        
    }
}