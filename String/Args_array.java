
package basic ;

import java.util.Scanner;

public class Args_array
{
    public static void main (String [] args)
    {
        args = new String [5] ;
        
        Scanner x = new Scanner (System.in) ;
        
        System.out.format("Enter the values : \n") ;
        
        for (int i=0 ; i<args.length ; i++)
        {
            args[i] = x.nextLine () ;
        }
        
        for (String v : args)
        {
            System.out.print(v + " ");
        }
    }
}