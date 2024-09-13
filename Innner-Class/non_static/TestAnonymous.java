
package non_static ;

public class TestAnonymous
{
    public static void main (String [] args)
    {
        Ali3 p1 = new Ali3() 
        {            
           @Override
           void msg()
           {
               System.out.println("This is over ride method");
           }
           
        } ;
        
        p1.msg();
    }
}