
package MessageDialog ;

import javax.swing. * ;
import java.awt. * ;

class Practice 
{
    public static void main (String [] args)
    {
        JOptionPane.showMessageDialog(null, "Check even odd number","Number System",JOptionPane.PLAIN_MESSAGE);
        
        String n1 = JOptionPane.showInputDialog(null,"Enter a number : ") ;
        
        int n = Integer.parseInt(n1) ;
        
        if (n % 2 == 0)
        {
            JOptionPane.showMessageDialog(null, "The number even");
        }
        else 
            JOptionPane.showMessageDialog(null, "The number is Odd.");
    }
}