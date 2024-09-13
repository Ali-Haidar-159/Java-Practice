
package basic ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SubList
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
        
        Iterator v = s.iterator() ;
        
        while(v.hasNext())
        {
            System.out.print(v.next()+" ");
        }
        
        List <Integer> s2 =  s.subList(3, 6) ;
        System.out.println(System.lineSeparator() +s2);
        
        Object max = Collections.max(s) ;
        System.out.println("Maximum value is : "+max);
        
        
        
    }
}