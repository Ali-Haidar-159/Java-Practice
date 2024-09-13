
package basic ;

import java.util.Scanner;

public class FactorsOfAnumber 
{
    public static void factor (int n , int f)
    {
        while (n%f == 0)
        {
            System.out.printf("%d * ",f);
            n = n / f;
        }
        System.out.print(n+System.lineSeparator()) ;
    }
    
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in );
        
        int mainNumber , fact  ;
        
        System.out.print("Enter a number : ");
        mainNumber = x.nextInt() ;
        System.out.print("Enter the fact number : ");
        fact = x.nextInt () ;
        
        System.out.println("The factors are : ");
        
        factor(mainNumber,fact);
    }
} 