
package problems ;

class Rectangle 
{
    double hight ;
    double width ;
    
    Rectangle (double h , double w)
    {
        hight = h ;
        width = w ;
    }
    
    void areaOfRectangle ()
    {
        double area = 0.5 * hight * width ;
        
        System.out.format("The area is %f ", area) ;
    }
}