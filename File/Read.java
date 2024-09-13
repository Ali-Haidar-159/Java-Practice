
package basic ;

import java.io.FileReader;

public class Read
{
    public static void main (String [] args)
    {       
        try
        {
            FileReader r = new FileReader("C:/Users/we/Desktop/TestFile/student.txt") ;
            
            int v ;
            
            while ((v=r.read()) != -1)
            {
                System.out.print((char)v);
            }
        }
        catch (Exception e)
        {
            System.out.print(e);
        }
    }
}