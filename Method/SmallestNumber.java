
package basic ;

import java.util.Scanner;

public class SmallestNumber 
{
    public static int smallestNumber (int x , int y ,int z)
    {
        if (x<y && x<z)
            return x ;
        else if (y<x && y<z)
            return y ;
        else 
            return z ;
    }
    
    public static void main (String [] args)
    {
        int a , b , c ;
        
        Scanner x = new Scanner (System.in );
        
        System.out.print("Enter first number : ");
        a = x.nextInt() ;
        System.out.print("Enter second number : ");
        b = x.nextInt() ;
        System.out.print("Enter third number : ");
        c = x.nextInt() ;
        
        int small = smallestNumber(a, b, c) ;
        
        System.out.print("The small number is : "+small +System.lineSeparator()) ;
    }
}