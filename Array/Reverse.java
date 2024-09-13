
package basic ;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse 
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in) ;
        
        int [] ar3 = new int [5] ;               
        int i , j , temp ;  
        
        System.out.println("Enter "+ar3.length+" values : ");
        
        for (i=0 ; i<ar3.length ; i++)
        {
            ar3[i] = x.nextInt() ;
        }
        
        i = ar3.length - 1 ;

        
        for (j=0 ; j<ar3.length/2 ; j++ )
        {
            if (i == ar3.length/2)
                break ;
            temp = ar3[j] ; //10
            ar3[j] = ar3[i] ; // 50
            ar3[i] = temp ; // 10
            i-- ;
        }
        
        System.out.println(Arrays.toString(ar3));
    }
}