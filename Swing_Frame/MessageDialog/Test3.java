
package MessageDialog ;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane ;

public class Test3
{
    public static void main (String [] args)
    {
        int choice = JOptionPane.showConfirmDialog(null,"Do you want :","input name",JOptionPane.YES_NO_OPTION) ;
        
        if (choice == JOptionPane.YES_OPTION)
        {
            String name = JOptionPane.showInputDialog(null,"Enter name :","input name",JOptionPane.QUESTION_MESSAGE) ;
            
            ImageIcon img = new ImageIcon("icon.png") ;
            
            JOptionPane.showMessageDialog(null, "Done "+name,"input name",JOptionPane.QUESTION_MESSAGE,img);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "ok");
        }
        
        
    }
}