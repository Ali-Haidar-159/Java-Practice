
package non_static ;

public class TestAnonymous3
{
    public static void main (String [] args)
    {
        Employee e1 = new Employee() 
        {
           
            @Override
            public void text1 ()
            {
                System.out.println("We cad do it");
            }
            
        } ;
        
        e1.text1 ();
    }
}