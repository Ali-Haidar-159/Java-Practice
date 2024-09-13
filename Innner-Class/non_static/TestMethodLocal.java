
package non_static ;

import java.util.Scanner;

public class TestMethodLocal 
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in) ;
        
        String name ; 
        int id , i , n ;
        
        Ali2 p1 = new Ali2 () ;
        
        System.out.print("Enter how many people : ");
        n = x.nextInt() ;
        
        for(i=0 ; i<n ; i++)
        {
            System.out.print("Enter name : ");
            name = x.next() ;
            System.out.print("Enter id : ");
            id = x.nextInt() ;
            
            p1.apple(name, id);
        }
        
    }

}