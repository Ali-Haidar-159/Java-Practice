
package basic ;

import java.util.Scanner;

public class Test_Ali7
{
    public static void main (String [] args)
    {
        Ali7 [] arr = new Ali7 [3] ;
        
        // packate a kore value initialize : 
        int i , id ;
        String name ;
        double salary ;
        
        Scanner x = new Scanner (System.in);
        
//        for (i=0 ; i<arr.length ; i++)
//        {
//            System.out.print("Enter name : ");
//            name = x.next() ;
//            System.out.print("Enter id : ");
//            id = x.nextInt() ;
//            System.out.print("Enter salary : ");
//            salary = x.nextDouble() ;
//            
//            Ali7 p = new Ali7 (name,id,salary) ;
//            arr[i] = p ; 
//        }
        
        // directly initialize : 
        
        for (i=0 ; i<arr.length ; i++)
        {
            System.out.print("Enter name : ");
            name = x.next() ;
            System.out.print("Enter id : ");
            id = x.nextInt() ;
            System.out.print("Enter salary : ");
            salary = x.nextDouble() ;

            arr[i] = new Ali7 (name , id , salary) ;
        }
        
        for (Ali7 v : arr)
        {
            v.display();
        }
    }
}