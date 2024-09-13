
package basic ;

import java.util.Arrays;
import java.util.Scanner;

public class InsertValue 
{
    public static void main (String [] args)
    {
        int [] ar = {10,20,40,50,60} ;
        
        int i , newNumber , position , j ;        
        
        System.out.println(Arrays.toString(ar));
        
        Scanner x = new Scanner (System.in );
        
        System.out.print("Enter the position : ");
        position = x.nextInt() ; 
        System.out.print("Enter the new value : ");
        newNumber = x.nextInt() ;
        
        x.close();
        
        for(j=ar.length-1 ; j>position ; j--)
                {
                    
                    ar[j] = ar[j-1];
                }
        
        ar[position-1] = newNumber ;
        
        System.out.println(Arrays.toString(ar));
    }
}
