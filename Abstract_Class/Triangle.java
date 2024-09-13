
package basic ;

class Triangle extends Shape
{
    //length , getArea() , msg() ;
    
    int base ;
    
    Triangle (int length , int  base)
    {
        super(length) ;
        this.base = base ;
    }
    
    double getArea ()
    {
        return 0.5*base*length ;
    }
    
}