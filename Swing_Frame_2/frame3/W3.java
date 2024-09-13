
package frame3  ;

import java.awt.*;
import javax.swing.*;

class Fram3 extends JFrame
{
    private Dimension size ;
    private Container c ;
    private Font fnt ;
    private ImageIcon icn ; 
    
    private JMenuBar mb ;
    private JMenu home , file , view , tools ;
    private JMenuItem newItem , openItem , deleteItem , cutItem , pasteItem ;
    
    Fram3 ()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Menubar Demo");
        
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
        fnt = new Font ("Arial",Font.BOLD,18) ;
        
        mb = new JMenuBar() ;
        
        this.setJMenuBar(mb);
        
        home = new JMenu("Menu") ;
        file = new JMenu("File") ;
        view = new JMenu("View") ;
        tools = new JMenu("Tools") ;
        
        
        mb.add(home) ;
        mb.add(file) ;
        mb.add(view) ;
        mb.add(tools) ;
        
        //newItem , openItem , deleteItem , cutItem , pasteItem
        
        newItem = new JMenu("New") ;
        openItem = new JMenu("Open") ;
        deleteItem = new JMenu("Delete") ;
        cutItem = new JMenu("Cut") ;
        pasteItem = new JMenu("Paste") ;
        
        home.add(newItem) ;
        home.add(openItem) ;
        file.add(deleteItem) ;
        file.add(cutItem) ;
        view.add(pasteItem) ;
    }
}