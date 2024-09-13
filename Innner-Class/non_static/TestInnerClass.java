
package non_static ;

public class TestInnerClass 
{
    public static void main (String [] args)
    {
        Ali obj = new Ali () ;
        
        Ali.Haidar p1 = obj.new Haidar("Akbar",101,5000) ;
        p1.printInfo2();
        
        Ali.Haidar p2 = obj.new Haidar("Rohmot",102,10000) ;
        p2.printInfo2();
    }
}