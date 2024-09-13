
package basic ;

import java.io.File;
import java.util.Scanner;

public class Scaner 
{
    public static void main (String [] args)
    {
        try
        {
            File f = new File ("C:/Users/we/Desktop/TestFile/student.txt") ;
            
            Scanner r = new Scanner (f) ;
            
            while (r.hasNext())
            {
                String s = r.next() ;
                System.out.print(s + " ");
                
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}