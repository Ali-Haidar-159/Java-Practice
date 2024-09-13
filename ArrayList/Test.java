
package basic ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Test 
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in );
        
        ArrayList <Integer> a = new ArrayList <Integer> () ;
        
        int n , num ,i ; 
        
        System.out.print("How many number : ") ;
        n = x.nextInt ();
        
        for (i=0 ; i<n ; i++)
        {
            System.out.print("Enter the number : ");
            num = x.nextInt() ;
            
            a.add(num) ;
        }      
        
        System.out.println("The first ArrayList is : "+a);
        
//        ArrayList <Integer> aa = new ArrayList <Integer> () ;
//        
//        
//        aa.addAll(a) ;
//        
//        //Collections.copy(aa, a);
//        
//        System.out.println("The second arrayList is : "+aa);
        
          Collections.reverse(a);
          
          System.out.println("After reverse : "+a);
        
    }
}