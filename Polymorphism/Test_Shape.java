
package basic ;

public class Test_Shape 
{
    public static void main (String [] args)
    {
        Shape s ; 
        
        s = new Triangle(5, 6) ;
        System.out.println("The area of triangle (5,6) : "+s.getArea());
        
        s = new Rectangle (5,6) ;
        System.out.println("The area of rectangle (5,6) : "+s.getArea());
    }
}