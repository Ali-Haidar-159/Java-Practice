
package basic ;

import java.io.File;
import java.util.Scanner;

public class Search 
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in) ;
        
        String name ;
        int id , i=0 , id2 ;
        double salary ;
        
        System.out.print("Enter id number for search : ");
        id2 = x.nextInt() ;
        
        try
        {
            File f = new File ("C:/Users/we/Desktop/TestFile/student.txt") ;
            Scanner r = new Scanner (f) ;
            
            while (r.hasNext())
            {
                name = r.next() ;
                id = r.nextInt() ;
                salary = r.nextDouble() ;
                
                if (id == id2)
                {
                    System.out.println("Name : "+name);
                    System.out.println("Id : "+id);
                    System.out.println("Salary : "+salary);
                    i++ ;
                    break ;
                }
            }
            
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
        
        if (i == 0)
            System.out.println("Information not found.");
        

    }
}