
package basic ;

public class Test 
{
    public static void main (String [] args)
    {
        try 
        {
        int a=19 , b=0 ;
        int r = a / b ;
        
        System.out.println("The result is : "+r);
        }
        
        catch (ArithmeticException o)
        {
            System.out.println("The exception is : "+o);
        }
        
        System.out.println("Hello world .");
        
    }
}