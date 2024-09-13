
package basic ;

class Triangle implements Shape
{
    //getArea() , nameOfShape() ;
    
    int hight ;
    int base ;
    
    Triangle (int hight , int base)
    {
        this.hight = hight ;
        this.base = base ;
    }
    
    public double getArea ()
    {
        return 0.5*base*hight ;
    }
    
    public void nameOfShape ()
    {
        System.out.println("This is Triangle .");
    }
}