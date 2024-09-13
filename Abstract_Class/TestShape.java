
package basic ;

public class TestShape 
{
    public static void main (String [] args)
    {
        Shape s ;
        
        s = new Triangle (5,6) ;
        System.out.println("Triangle area is : "+s.getArea());
        
        s = new Circle (6,5) ;
        System.out.println("Circle area is : "+s.getArea());
                
//        new Triangle(5,6).msg();
    }
}