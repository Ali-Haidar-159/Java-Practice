
package basic ;

import java.util.Scanner;

public class Contains 
{
    public static void main (String [] args)
    {
        String s1 , s2 ; 
        
        Scanner x = new Scanner (System.in );
        
        System.out.print("Enter a line : ");
        s1 = x.nextLine() ;
        System.out.format("Enter a sentence to search : ") ;
        s2 = x.next() ;
        
        System.out.println(s1.contains(s2) ? "Equal" : "Not Equal");
    }
}