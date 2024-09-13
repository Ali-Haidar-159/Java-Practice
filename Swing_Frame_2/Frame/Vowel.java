
package Frame ;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FrameV extends JFrame
{
    private Dimension size ;
    private Container c ;
    private Font fnt ;
    
    private JLabel l1 , lTotal , lA , lE , lI , lO , lU ;
    private JTextArea ta ;
    private JButton clr ;
    private JScrollPane scrl ;
    
    int a=0 , e=0 , i=0 , o=0 , u=0 , total=0 ;
       
    
    FrameV ()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Check Vowel");
        
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
        fnt = new Font ("Arial",Font.BOLD,20) ;
        
        l1 = new JLabel("Enter text :") ;
        l1.setBounds(20,100,150,20);
        l1.setFont(fnt);
        c.add(l1) ;
        
        ta = new JTextArea() ;
        ta.setFont(fnt); 
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        c.add(ta) ;
        
        scrl = new JScrollPane(ta) ;
        scrl.setBounds(180,20,400,200);
        c.add(scrl) ;
        
        lTotal = new JLabel("") ;
        lTotal.setBounds(20,230,300,50);
        lTotal.setFont(fnt);
        c.add(lTotal) ;
        
        lA = new JLabel("") ;
        lA.setBounds(20,290,300,50);
        lA.setFont(fnt);
        c.add(lA) ;
        
        lE = new JLabel("") ;
        lE.setBounds(20,350,300,50);
        lE.setFont(fnt);
        c.add(lE) ;
        
        lI = new JLabel("") ;
        lI.setBounds(20,410,300,50);
        lI.setFont(fnt);
        c.add(lI) ;
        
        lO = new JLabel("") ;
        lO.setBounds(20,470,300,50);
        lO.setFont(fnt);
        c.add(lO) ;
        
        lU = new JLabel("") ;
        lU.setBounds(20,530,300,50);
        lU.setFont(fnt);
        c.add(lU) ;
        
        clr = new JButton("Clear");
        clr.setBounds(590,100,100,50);
        clr.setFont(fnt);
        clr.setBackground(Color.ORANGE);
        c.add(clr) ;
        
        this.addListener();
    }
    
    void addListener ()
    {
        ta.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) 
            {
                
            }

            @Override
            public void keyPressed(KeyEvent ek) 
            {
                if (ek.getSource() == ta)
                {
                    if (ek.getKeyCode() == 'a' || ek.getKeyCode() == 'A')
                    {
                        total++ ;
                        a++ ;
                        lA.setText("The number a : "+a);
                        lTotal.setText("Total vowel : "+total);
                    }
                    
                    else if (ek.getKeyCode() == 'e' || ek.getKeyCode() == 'E')
                    {
                        total++ ;
                        e++ ;
                        lE.setText("The number e : "+e);
                        lTotal.setText("Total vowel : "+total);
                    }
                    
                    else if (ek.getKeyCode() == 'i' || ek.getKeyCode() == 'I')
                    {
                        total++ ;
                        i++ ;
                        lI.setText("The number i : "+i);
                        lTotal.setText("Total vowel : "+total);
                    }
                    
                    else if (ek.getKeyCode() == 'o' || ek.getKeyCode() == 'O')
                    {
                        total++ ;
                        o++ ;
                        lO.setText("The number o : "+o);
                        lTotal.setText("Total vowel : "+total);
                    }
                    
                    else if (ek.getKeyCode() == 'u' || ek.getKeyCode() == 'U')
                    {
                        total++ ;
                        u++ ;
                        lU.setText("The number u : "+u);
                        lTotal.setText("Total vowel : "+total);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) 
            {
                
            }       
        });
        
        clr.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent ea)
            {
                if (ea.getSource() == clr)
                {
                    ta.setText("");
                    a = 0 ;
                    e = 0 ;
                    i = 0 ; 
                    o = 0 ; 
                    u = 0 ;
                    total = 0 ; 
                }
            }
            
        });
        
    }
}