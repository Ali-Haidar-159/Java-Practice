
package Basic ;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface
{
    public static void main (String [] args)
    {
        Collection <Integer> z = new ArrayList<Integer>() ;
        
        z.add(10) ;
        z.add(20) ;
        z.add(30) ;
        
        System.out.println("The collection is : "+z);
    }
}