
package basic ;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList 
{
    public static void main (String [] args)
    {
        Integer [] arr = {10,20,30,4,40} ;
        
        ArrayList <Integer> m = new ArrayList <Integer> (Arrays.asList(arr)) ;
        
        System.out.println("The array is : "+Arrays.toString(arr));
        System.out.println("The arrayList is : "+m);
    }
}