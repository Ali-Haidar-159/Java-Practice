
package basic ;

import java.util.Scanner;

public class Sum 
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in );
        
        int sum=0 , flag=0 , number , i , j ;
        
        int [] a = {5,6,9,8,41,23,25,14,10,20,30} ;
        
        System.out.print("Enter a number : ");
        number = x.nextInt() ;
        
        for (i=0 ; i<a.length ; i++)
        {
            sum = 0 ;
            for (j=i+1 ; j<a.length ; j++)
            {
                sum = a[i] + a[j] ;
                if(sum == number)
                    flag++;
            }
        }
        
        System.out.println("We found "+flag+" pair.");
    }
}