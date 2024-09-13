
package basic ;

import java.util.Scanner;

public class StringArray 
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in );
        
        String [] arr = new String [5] ;
        
        System.out.println("Enter values : ");
        for (int i=0 ; i<arr.length ; i++)
        {
            arr[i] = x.nextLine() ;
        }
        
        for (String v : arr)
        {
            System.out.print(v+" ");
        }
    }
}