
package basic ;

import java.util.Scanner;

class Rectangle extends Shape
{
    //getArea () ;
    
    void getArea ()
    {
        int len , width ;
        
        Scanner x = new Scanner (System.in);
        
        System.out.print("Enter the length : ");
        len = x.nextInt () ;
        System.out.print("Enter width : ");
        width = x.nextInt() ;
        
        System.out.println("The area is : "+(len*width));
    }
}