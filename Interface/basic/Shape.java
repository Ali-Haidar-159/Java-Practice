
package basic ;

interface Shape 
{
    abstract double getArea () ;
    
    default void nameOfShape ()
    {
        System.out.println("This is shape interface.");
    }
}