
package Basic ;

import java.util.Vector;

public class TestVector 
{
    public static void main (String [] args)
    {
        Vector <Integer> v = new Vector <Integer> () ;
        
        v.add(100) ;
        v.add(200) ;
        v.add(300) ;
        
        System.out.println("The Vector is : "+v);
    }
}