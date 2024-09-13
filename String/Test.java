
package basic ;

import java.util.Arrays;

public class Test 
{
    public static void main (String [] args)
    {
        String s = "My name is - Ali Haidar." ;
        System.out.println(s);
                
        String [] arr = s.split("-") ;
        
        System.out.println(Arrays.toString(arr));
    }
}