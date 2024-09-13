
package basic ;

import java.util.Arrays;

public class EvenOdd 
{
    public static void main (String [] args)
    {
        int i , j=0 , k=0 ;
        int [] a = {1,2,5,4,9,7,6,4,10,12,16} ;
        int [] even = new int [a.length] ;
        int [] odd = new int [a.length] ;
                
        
        for (i=0 ; i<a.length ; i++)
        {
            if (a[i] % 2 == 0)
            {
                even[j] = a[i] ;
                j++ ;
            }
            else 
            {
                odd[k] = a[i] ;
                k++ ;
            }
        }
        
        System.out.println("The original array is : "+Arrays.toString(a));
        System.out.println("The even array is : "+Arrays.toString(even));
        System.out.println("The odd array is : "+Arrays.toString(odd));
    }
}