
package problems ;

import java.util.Scanner;

public class Test_Rectangle 
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in);
        
        double hight , width ;
        int i ; 
        
        for (i=0 ; i<2 ; i++)
        {
        System.out.format("\nEnter hight : ") ;
        hight = x.nextDouble() ;
        System.out.format("Enter width : ") ;
        width = x.nextDouble() ;
        
        Rectangle r = new Rectangle(hight,width) ;
        r.areaOfRectangle();
        }
    }
}