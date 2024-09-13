
package basic ;

import java.util.Scanner;

public class Test_Ali4 
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in) ;
        
        String name ;
        int id ;
        double salary ;
        
        System.out.print("Enter name : ") ;
        name = x.nextLine() ;
        System.out.print("Enter Id : ");
        id = x.nextInt() ;
        System.out.print("Enter salary : ");
        salary = x.nextDouble() ;
        
        Ali4 p1 = new Ali4 (name,id,salary) ;
        p1.disValue(); 
        

        
    }
}