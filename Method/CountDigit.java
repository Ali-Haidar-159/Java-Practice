// how many times 2 present in an integer value . 
package basic ;

import java.util.Scanner;

public class CountDigit
{
    public static int countDigit (int num)
    {
        int i , flag=0  , result ;
        
        while (num>0)
        {
            result = num % 10 ;

            if (result == 2)
                flag ++ ;
            num = num / 10 ;
        }
        
        return flag ;
    }
    
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in);
        
        int n , value  ;
        
        System.out.print("Enter a number : ") ;
        value = x.nextInt () ;
        
        n = countDigit(value) ;
        
        System.out.println("Total "+n+" times ") ;
    }
}