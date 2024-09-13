
package Basic ;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo1 
{
    public static void main (String [] args)
    {
        LinkedList <Integer> number = new LinkedList <Integer> () ;   
        
        Scanner x = new Scanner (System.in) ;
         
        int i , n , j , size ;
        
        for (i=1 ; i<10 ; i++)
        {
            number.add(i) ;
            //System.out.format("The number is added : %d \n",i) ;
        }
         
         System.out.println("After sort the list : "+number);
         
         System.out.print("Enter a number : ");
         n = x.nextInt() ;
         
         size = number.size() ;
         
         for (i=0 ; i<size-1 ; i++)
         {
             for (j=i+1 ; j<size ; j++)
             {
                 if (number.get(i)+number.get(j) == n)
                 {
                     System.out.println("( "+number.get(i)+" , " + number.get(j)+" )");
                    // System.out.format("( %d , %d )\n",number.get(i),number.get(j)) ;
                 }
             }
         }
        
    }
}