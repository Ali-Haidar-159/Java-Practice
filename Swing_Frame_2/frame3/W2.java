package frame3;

import java.awt.*;
import javax.swing.*;

class Fram2 extends JFrame 
{
    private Dimension size ;
    private Container c ; 
    private Font fnt ;
    
    JTable table ;
    
    
    Fram2()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTabbed Demo");

        size = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(size.width, size.height);

        this.setLocation(0, 0);

        this.separateContentPane();
        this.addComponant();

        this.setVisible(true);
    }

    void separateContentPane() 
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
    }

    void addComponant() 
    {
        String [] colmName = {"Name","Id","Salary"} ;
        String [][] row = {
                          
            {"Ali","1","5000"},      
            {"Ali","1","5000"},      
            {"Ali","1","5000"},      
            {"Ali","1","5000"},      
                           } ;
        
        table = new JTable(row,colmName) ;
        table.setBounds(20,20,400,300);
        c.add(table) ;
        
        
    }
}
