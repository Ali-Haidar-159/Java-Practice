
package basic ;

abstract class Shape 
{
    int length ;
    
    Shape (int length)
    {
        this.length = length ;
    }
    
    void msg ()
    {
        System.out.println ("This is parent class .") ;
    }
    
    abstract double getArea () ;
}