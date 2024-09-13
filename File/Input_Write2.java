
package basic ;

import java.io.FileWriter;
import java.util.Scanner;

public class Input_Write2
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in); 
        
        String name , id , salary ;
        int i , n ;
        
        System.out.print("Enter how many student : ");
        n = x.nextInt() ;
        
        for (i=0 ; i<n ; i++)
        {
            System.out.print("Enter name : ");
            name = x.next() ;
            System.out.print("Enter id : ");
            id = x.next() ;
            System.out.print("Enter salary : ");
            salary = x.next() ;
            
            try
            {
                FileWriter w = new FileWriter("C:/Users/we/Desktop/TestFile/student.txt",true) ;
                
                w.write(name+System.lineSeparator());
                w.write(id+System.lineSeparator());
                w.write(salary+System.lineSeparator());
                
                w.close();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}