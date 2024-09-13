
package basic ;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_Ali6
{
    public static void main (String [] args)
    {
        ArrayList <Ali6> m = new ArrayList <Ali6> () ;
        
        int n , i , id ;
        String name ; 
        double salary ;
        Ali6 p ;
        
        Scanner x = new Scanner (System.in) ;
        
        System.out.print("How many employee : ");
        n = x.nextInt() ;
        
        for (i=0 ; i<n ; i++)
        {
            System.out.print("Enter name : ");
            name = x.next() ;
            System.out.print("Enter id : ");
            id = x.nextInt() ;
            System.out.print("Enter salary : ") ;
            salary = x.nextDouble() ;
            
            p = new Ali6 (name,id,salary) ;
            
            m.add(p) ;            
        }
        
        System.out.println("The values are below : ");
        
        for (Ali6 v : m)
        {
            v.diss();
        }
        
    }
}