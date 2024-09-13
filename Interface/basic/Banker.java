
package basic ;

interface Banker
{
    static final String post = "banker" ;
    static final double salary = 25000 ;
    
    abstract void msg2 () ;
    
    default void test ()
    {
        System.out.println("This is default method.");
    }            
}