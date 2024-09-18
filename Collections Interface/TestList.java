
package Basic ;

import java.util.ArrayList;
import java.util.List;

public class TestList
{
    public static void main (String [] args)
    {
        List <Integer> t = new ArrayList <Integer> () ;
        
        t.add(500) ;
        t.add(600) ;
        t.add(700) ;
        
        System.out.println("The List is : "+t);
        
    }
}