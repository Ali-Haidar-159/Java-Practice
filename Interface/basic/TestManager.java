
package basic ;

public class TestManager 
{
    public static void main (String [] args)
    {
        Manager m1 = new Manager (5000) ;
        
        m1.printInfo();
        
        m1.msg();
        m1.msg2();
        m1.test();
    }
}