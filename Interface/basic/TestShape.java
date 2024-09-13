
package basic ;

public class TestShape 
{
    public static void main (String [] args)
    {
        Shape s ;
        
        s = new Triangle(5, 6) ;
        s.nameOfShape();
        System.out.println("Area of triangle : "+s.getArea());
        
        s = new Circle(5) ;
        s.nameOfShape();
        System.out.println("Area of circle : "+s.getArea());
    }
}