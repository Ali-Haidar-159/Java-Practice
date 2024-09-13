
package basic ;

import java.util.Scanner;

public class Concat
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in );
        
        String s1 , s2 ; 
        int i ;
        
        System.out.print("Enter a String : ");
        s1 = x.nextLine() ;
        System.out.format("Enter another String : ") ;
        s2 = x.nextLine() ;
        
        System.out.println(s1.concat(s2));
        
        
    }
}