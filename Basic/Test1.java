
package basic ;

import java.util.Scanner;

public class Test1
{
    public static void main (String [] args)
    {
        String name ;
        int id ;
        double mark ;
        
        Scanner x = new Scanner (System.in) ;
        
        System.out.print("Enter your name :");
        name = x.nextLine();
        System.out.print("Enter your id : ");
        id = x.nextInt() ;
        System.out.print("Enter your mark : ");
        mark = x.nextDouble();
        
        System.out.println("\nHere all the details : "+System.lineSeparator());
        System.out.println("Your name is : "+name);
        System.out.println("Your id is : "+id);
        System.out.println("Your mark is : "+mark);
        
    }
}