
package basic ;

import java.util.Scanner;

public class Nested_Try_Catch
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in) ;
        
        int [] a = {10,20,50,60,60,30} ;
        int index , d  , r ;
        
        System.out.println("Enter the index number : ");
        index = x.nextInt() ;
        System.out.println("Enter the number for devide :");
        d = x.nextInt() ;
        
        try 
        {
           System.out.println("The value is : "+a[index]);
           
           try 
           {
             r = a[index]/d ; 
             System.out.println("The result is : "+r);
           }
           
           catch (Exception e)
           {
               System.out.println("The exception is : "+e);
               System.out.println("LEVEL-2");
           }
        }
        catch (Exception e)
        {
            System.out.println("The exception is : "+e);
            System.out.println("LEVEL-1");
        }
    }
}