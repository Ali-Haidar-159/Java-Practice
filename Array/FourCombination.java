
package basic ;

import java.util.Scanner;

public class FourCombination 
{
    public static void main (String [] args)
    {
        int i , j , m , n , sum=0 , number ;
        int [] a = {10,20,30,40,1,2}  ;
        
        Scanner x = new Scanner (System.in );
        
        System.out.print("Enter the expected number : ") ;
        number = x.nextInt() ;
        
        for (i=0 ; i>a.length ; i++)
        {
            for(j=i+1 ; j<a.length ; j++)
            {
                for(m=j+1 ; m<a.length ; m++)
                {
                    for(n=m+1 ; n<a.length ; n++)
                    {
                        if (a[i]+a[j]+a[m]+a[n] == number)
                            System.out.println("The numbers are : "+a[i]+a[j]+a[m]+a[n]);
                            
                    }
                }
            }
        }
        
    }
}