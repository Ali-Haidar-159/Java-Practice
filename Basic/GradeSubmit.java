
package basic ;

import java.util.Scanner ;

public class GradeSubmit
{
    public static void main(String [] args)
    {
        int mark ;
        String name ;
        
        Scanner x = new Scanner (System.in) ;
        
        System.out.print("Enter your name : ");
        name = x.nextLine() ;
        System.out.print("Enter your mark : ");
        mark = x.nextInt() ;
        
        System.out.println("\nYour name : "+name) ;
        if(mark>80)
            System.out.println("You got A+ .");
        else if(mark<=80 && mark>65)
            System.out.println("You got A- .");
        else if(mark<=65 && mark>55)
            System.out.println("You got B+ .");
        else if(mark<=55 && mark>45)
            System.out.println("You got C+ .");
        else if(mark<=45 && mark>33)
            System.out.println("You got D+ .");
        else
            System.out.println("Sorry !!! You are failed .");
        
    }
}