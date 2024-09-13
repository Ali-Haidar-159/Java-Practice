
package problems ;

import java.util.Scanner;

class TraficLight 
{
    String colour ;
    int duration ; 
    
    TraficLight ()
    {
        Scanner x = new Scanner (System.in) ;
        
        System.out.print("Enter colour : ");
        colour = x.next() ;
        System.out.print("Enter duration : ");
        duration = x.nextInt() ;
    }
    
    boolean checkColour ()
    {
        if (colour.equalsIgnoreCase("red"))
            return true ;
        else  
            return false;
    }
    
    void setColour (String clr)
    {
        colour = clr ;
    }
    
    void setDuration (int d)
    {
        duration = d ;
    }
}