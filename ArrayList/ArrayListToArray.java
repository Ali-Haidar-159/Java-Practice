
package basic ;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray
{
    public static void main (String [] args)
    {
        ArrayList <Integer> s = new ArrayList <Integer> () ;
        
        s.add(10) ;
        s.add(20) ;
        s.add(30) ;
        s.add(40) ;
        s.add(50) ;
        s.add(60) ;
        s.add(70) ;
        s.add(80) ;
        s.add(90) ;
        
        System.out.println("The arrayList is : "+s) ;
        
        Integer [] arr = new Integer [s.size()] ;
        arr = s.toArray(arr) ;
        
        System.out.println("The array is : "+Arrays.toString(arr));
    }
}