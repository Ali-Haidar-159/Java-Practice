
package basic ;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnArray 
{
    public static int[] average (int [] arr)
    {
        System.out.println("The array is : "+Arrays.toString(arr));
        
        Arrays.sort(arr);
        
        int [] result = new int [2] ;
        int large , ave , sum=0 ;
        
        large = arr[arr.length-1];
        
        for (int v : arr)
        {
            sum+= v ;
        }
        ave = sum / arr.length ;
        
        result[0] = large ;
        result[1] = ave ;
        
        return  result ;
        
    }
    
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in); 
        
        int i=0 , largestNumber , average ;         
        int [] arr , result  ;
        
        System.out.println("Enter 5 values : ");
        
        for (int v : arr=new int [5])
        {
            arr[i] = x.nextInt() ;
            i++ ;
        }
        
       result = average(arr) ;
       
       largestNumber = result[0] ;
       average = result[1] ;
       
       System.out.println("The largest number is : "+largestNumber+"\nThe average is : "+average);
       
    }
}