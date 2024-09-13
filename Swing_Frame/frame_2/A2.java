package frame_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame2 extends JFrame
{

    private Dimension size;
    private ImageIcon icon;
    private Container c;
    private Font fnt;

    Frame2() 
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Login Frame");

        size = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(size.width, size.height);

        this.setLocation(0, 0);

        icon = new ImageIcon(getClass().getResource("icon.jpg"));
        this.setIconImage(icon.getImage());

        this.separateContentPane();
        this.addComponant();

        this.setVisible(true);
    }

    void separateContentPane()
    {
        c = this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);
    }

    void addComponant()
    {
        fnt = new Font ("Times New Roman",Font.BOLD,20) ;
                
        JTextArea ta = new JTextArea() ;
        ta.setFont(fnt);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
                
        JScrollPane scrl = new JScrollPane(ta) ;
        scrl.setBounds(50,20,400,300);
        c.add(scrl) ;
    }
}