
package Basic ;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet 
{
    public static void main (String [] args)
    {
        //HashSet <Integer> hs = new HashSet<Integer>() ;
        Set <Integer> hs = new HashSet <Integer>() ;
        
        hs.add(99) ;
        hs.add(95) ;
        hs.add(45) ;
        
        System.out.println("The HashSet is : ");
        for (Integer v : hs)
        {
            System.out.print(v+" ");
        }
    }
}