
package basic ;

import java.util.Formatter;
import java.util.Scanner;

public class Input_Write
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in) ;
        
        String name ;
        int id , n ;
        double salary ;
        
        System.out.print("How many student you want to add : ");
        n = x.nextInt() ;
        
        for (int i=0 ; i<n ; i++)
        {
            try
            {
                System.out.print("Enter name :  ");
                name = x.next() ;
                System.out.print("Enter id : ");
                id = x.nextInt() ;
                System.out.print("Enter salary : ");
                salary = x.nextDouble() ;
                                
                Formatter w1 = new Formatter("C:/Users/we/Desktop/TestFile/student.txt") ;
                w1.format("%s %d %f",name,id,salary) ;
                
                w1.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        
        
    }
}