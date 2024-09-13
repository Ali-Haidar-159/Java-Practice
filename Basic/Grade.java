
package basic ;

import java.util.Scanner ;

public class Grade
{
    public static void main (String [] args)
    {
        String name , highestName=null ;
        double mark , highestMark=0 ;
        int i , numberOfStudent ;
        
        Scanner x = new Scanner (System.in) ;
        
        System.out.print("Enter how many student : ");
        numberOfStudent = x.nextInt() ;
        
        for (i=0 ; i<numberOfStudent ; i++)
        {
            System.out.printf("Enter %d student's name : ",i+1) ;
            name = x.next() ;
            System.out.format("Enter %d student's mark : ",i+1) ;
            mark = x.nextDouble() ;
            
            if(mark>highestMark)
            {
                highestMark = mark ;
                highestName = name ;
            }
            
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
        
        System.out.println("\nAll students mark subitted.");
        
        System.out.println(highestName+" got the highest mark which is "+highestMark);
        
    }
}