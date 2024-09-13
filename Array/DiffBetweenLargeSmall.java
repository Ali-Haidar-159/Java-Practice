
package basic ;

import java.util.Arrays;

public class DiffBetweenLargeSmall
{
    public static void main (String [] args)
    {
        int [] a = {4,6,8,55,9,45,15,46} ;
        int i , average , large , small , difference , sum=0  ;
        
        large = a[0] ;
        for (i=0 ; i<a.length ; i++)
        {
            if (a[i] > large)
                
                large = a[i] ;
        }
        
        small = a[0] ;
        for (i=0 ; i<a.length ; i++)
        {
            if(a[i] < small)
                small = a[i] ;
            sum += a[i] ;
        }
        
        difference = large - small ;
        average = (sum-(large+small)) / (a.length-2) ;
        
        System.out.println("The array is : "+Arrays.toString(a));
        System.out.println("Difference between large and small number : "+difference);
        System.out.println("Average without large and small number : "+average);
                
        
    }
}