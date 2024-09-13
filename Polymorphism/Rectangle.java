
package basic ;

class Rectangle extends Shape
{
    //length , getArea () ;
    
    int width ;

    public Rectangle(int length , int width) 
    {
        super(length);
        this.width = width ;
    }
    
    double getArea ()
    {
        return length * width ; 
    }
    
    
}