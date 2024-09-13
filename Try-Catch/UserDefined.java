package basic ;

import java.util.Scanner;

class InvalidAge extends Exception
{
//   InvalidAge ()
//   {
//        System.out.println("This is constructor.") ;
//   }
}

public class UserDefined 
{
    public static void main (String [] args)
    {
        try 
        {
            Scanner x = new Scanner (System.in) ; 
            
            int age ; 
            
            System.out.print("Enter age : ");
            age = x.nextInt() ;
            
            if (age>18)
                throw new InvalidAge() ;
            
            System.out.println("Your age is : "+age);
            
        }
        
        catch (Exception o)
        {
            System.out.println("Exception is : "+o) ;
        }
        
        finally 
        {
            System.out.format("This is finally block.\n") ;
        }
        
        System.out.println("This is out of try block.");
    }
}