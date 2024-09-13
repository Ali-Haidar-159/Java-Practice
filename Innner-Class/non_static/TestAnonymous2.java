
package non_static ;

public class TestAnonymous2
{
    public static void main (String [] args)
    {
        Person p1 = new Person ("Akbar" , 101) 
        {
               @Override
            void display ()
            {
                System.out.println("Name : "+name) ;
                System.out.println("Id : "+id + System.lineSeparator());
            }
           
               @Override
            void message2 ()
            {
                System.out.println("This is anonymous inner class") ;
            }
            
        } ;
                
        p1.display();
        p1.message2();
    }
}
