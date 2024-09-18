
package Basic ;

import java.util.Stack;

public class TestStack 
{
    public static void main (String [] args)
    {
        Stack <Integer> s = new Stack <Integer> () ;
        
        s.push(101) ;
        s.push(201) ;
        s.push(301) ;
        
        System.out.println("The original stack is : "+s);
        
        System.out.println("The last value or top value is : "+s.pop());
    }
}