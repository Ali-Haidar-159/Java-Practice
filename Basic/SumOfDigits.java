
package basic ;

import java.util.Scanner;

public class SumOfDigits
{
    public static void main(String [] args)
    {
        int n , sum=0 , modulas , flag=0;
        
        Scanner x = new Scanner (System.in) ;
        
        System.out.print("Enter a number to the sum of digits : ");
        n = x.nextInt() ;
        
        while(n>0)
        {
            modulas = n % 10 ;
            n = n / 10 ;
            sum += modulas ;
            flag++ ;
        }
        
        System.out.println("The sum is : "+sum);
        System.out.println("Total digit : "+flag);
    }
}