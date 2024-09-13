
package MessageDialog ;

import javax.swing.ImageIcon ;
import javax.swing.JOptionPane ;


class Test1 
{
    public static void main (String [] args)
    {
        ImageIcon img = new ImageIcon("icon.png") ;
        JOptionPane.showMessageDialog(null, "Wrong passward","Error",JOptionPane.PLAIN_MESSAGE,img);
    }
}