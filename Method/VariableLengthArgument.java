
package basic ;

import java.util.Scanner;

public class VariableLengthArgument 
{
    public static void add (int ... x)
    {
        int sum =0 ; 
        
       for (int v : x)
       {
           sum += v ;
       }
        //sum=0 jodi hoi tar mane kono value pass kora hoi ni . karon value pass hole 
        // to sum=0 hoito na .
        
        System.out.println(sum != 0 ? "The sum is : "+sum : "No value pass");
    }
    
    public static void main (String [] args)
    {
        add (10,5,4,9,3,5) ;
        
        add () ;
    }
}