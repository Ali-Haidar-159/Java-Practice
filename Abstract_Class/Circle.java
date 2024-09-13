
package basic ;

class Circle extends Shape
{
    //length , msg() , getArea () ;
    
    int radious ;

    public Circle(int length , int radious) 
    {
        super(length);
        this.radious = radious ;
    }
    
    @Override
    double getArea ()
    {
        return Math.PI * radious * radious ;
    }
}