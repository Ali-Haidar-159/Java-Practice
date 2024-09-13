
package MessageDialog ;

import javax.swing.JOptionPane;

public class Test2 
{
    public static void main (String [] args)
    {
       String fName = JOptionPane.showInputDialog(null,"Enter first name : ","First name",JOptionPane.QUESTION_MESSAGE) ;
       String lName = JOptionPane.showInputDialog(null,"Enter last name : ","last name ",JOptionPane.QUESTION_MESSAGE);
       
       String name = fName+lName ;
       
       JOptionPane.showMessageDialog(null , "Name : "+name);
       
    }
}