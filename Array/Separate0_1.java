
package basic ;

import java.util.Arrays;

public class Separate0_1
{
    public static void main (String [] args)
    {
        int i , j , temp=0 ;
        int [] a = {1,0,0,1,1,0,1,0,0,1,0,0,1,1,0} ;
        
        System.out.println("Before separate : "+Arrays.toString(a));
        
        for (i=0 ; i<a.length ; i++)
        {
            if(a[i] == 1)
            {
                for(j=a.length-1 ; j>i ; j--)
                {
                    if (a[j] == 0)
                    {
                        temp = a[j] ;
                        a[j] = a[i] ;
                        a[i] = temp ;
                    }
                }
            }
        }
        
        System.out.println("After separate : "+Arrays.toString(a));
    }
}