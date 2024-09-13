
package basic ;

import java.util.Arrays;

public class Stack1 
{
    static int [] stac = new int [5] ;
    static int top = -1 ;    
    
    public static void push (int item)
    {
        if (top<5)
        {
            top++ ;
            stac[top] = item ;
            
            System.out.println("Item Added successfully .");
        }
        else
        {
            System.out.println("There is no capacity.");
        }
    }
    
    public static int pop ()
    {
        if (top >= 0)
        {
            int topValue = stac[top] ;
            stac[top] = -1 ;
            
            System.out.println("Item is removed .");
            
            top-- ;
            
            return topValue ;
        }
        else 
        {
            System.out.println("The stack is null .") ;
            
            return 0 ;
        }
    }
    
    public static int peak ()
    {
        if (top >= 0)
        {
            return stac[top] ;
        }
        else 
            return 0 ;
    }
    
    public static void printStack ()
    {
        System.out.println("The stack is : "+Arrays.toString(stac));
    }
    
    public static void main (String [] args)
    {
        push(10) ;
        push(20) ;
        push(30) ;
        push(40) ;
        push(50) ;
        
        printStack();
        
        pop() ;
        pop() ; 
        
        printStack();
        
        int topValue = peak() ;
        
        System.out.println("The top value is : "+topValue);
        
    }
}