
package basic ;

import java.util.Arrays;

public class MoveZero 
{
    public static void main (String [] args)
    {
        int i , j , temp=0  , nonZeroValue=0 ;
        int [] a = {10,0,20,30,0,40} ;
        
        System.out.println("Before moving zero : "+Arrays.toString(a));
        
        for (i=0 ; i<a.length-1 ; i++)
        {
            if (a[i] == 0)
            {
                for (j=a.length-1 ; j>i ; j--)
                {
                    if (a[j] != 0)
                    {
                        temp = a[j] ;
                        a[j] = a[i] ;
                        a[i] = temp ;
                    }
                }
            }
        }
        
        i = 0 ;
        while (a[i] != 0)
        {
            nonZeroValue ++ ;
            i++ ;
        }
        
        Arrays.sort(a,0,nonZeroValue);
        
        System.out.println("After moving zero : "+Arrays.toString(a));
        
    }
}