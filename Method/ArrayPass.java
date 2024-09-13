
package basic ;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPass 
{
    public static int largestNumber (int [] arr)
    {
        System.out.println(Arrays.toString(arr));
        
        Arrays.sort(arr);
        
        int large = arr[arr.length-1] ;
        
        return  large ; 
    }
    
    public static void main (String [] args)
    {
        int [] arr = new int [5] ;
        int i ; 
        
        Scanner x = new Scanner (System.in) ;
        
        System.out.println("Enter 5 values : ");
        for (i=0 ; i<arr.length ; i++)
        {
            arr[i] = x.nextInt() ;
        }
        
        int n = largestNumber(arr) ;
        
        System.out.println("The large number is : "+n);
    }
}