
package basic ;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber 
{
    public static void main (String [] args)
    {
        int firstNum , lastNum , sum1=0 , sum2=0 , missingNum = 0 ;
        
        Scanner x = new Scanner (System.in );
        
        int [] numbers = {10,12,13,14,15,16,17} ;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        System.out.print("Enter the first name : ");
        firstNum = x.nextInt() ;
        System.out.print("Enter the last number : ");
        lastNum = x.nextInt () ;
        
        for (int i=firstNum ; i<=lastNum ; i++)
        {
            sum1 = sum1+ i ;
        }
        
        for (int i=0 ; i<numbers.length ; i++)
        {
            sum2 = sum2 + numbers[i] ;
        }
        
        missingNum = sum1 - sum2 ; 
        
        System.out.println("The missing number is : "+missingNum);
        
        
    }
}