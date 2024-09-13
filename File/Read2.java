
package basic ;

import java.io.File;
import java.util.Scanner;

public class Read2
{
    public static void main (String [] args)
    {
        String name ;
        int id , i=0 ;
        double salary ;
        
        try
        {
            File f = new File ("C:/Users/we/Desktop/TestFile/student.txt") ;
            Scanner r = new Scanner (f) ;
            
            while (r.hasNext())
            {
                i++ ;
                name = r.next() ;
                id = r.nextInt() ;
                salary = r.nextDouble() ;
                
                System.out.println("\t\t["+i+"]");
                System.out.println("Name : "+name);
                System.out.println("Id : "+id) ;
                System.out.println("Salary : "+salary);
            }
            
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}