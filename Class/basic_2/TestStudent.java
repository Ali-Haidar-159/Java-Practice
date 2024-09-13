
package basic_2 ;

import java.util.Scanner;

public class TestStudent 
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in) ;
        
        Student p1 = new Student ("Karim",121,4.5) ;
        p1.display();
        
        Student p2 = new Student ("Matin",122,4.5) ;
        p2.display();
    }
}