
package frame ;

import javax.swing.JFrame;

public class Frame1
{
    public static void main (String [] args)
    {
        JFrame f1 = new JFrame() ;
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f1.setSize(300, 200);
//        f1.setLocation(300, 200);
        //f1.setLocationRelativeTo(null);
        f1.setBounds(500, 200, 500, 500);
        f1.setTitle("Frame Demo");
        f1.setResizable(false);
    }
}