
package basic ;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate 
{
    public static void main (String [] args)
    {
        int i , j , n , element  ;
        ArrayList <Integer> a = new ArrayList <Integer> ()  ;
        
        Scanner x = new Scanner (System.in );
        
        System.out.format("How many number you want to add : ") ;
        n = x.nextInt() ;
        
        for (i=0 ; i<n ; i++)
        {
            System.out.print("Enter the number to add : ");
            element = x.nextInt() ;
            a.add(element) ;
        }
        
        System.out.println(a);
        
        for (i=0 ; i<a.size() ; i++)
        {
            for (j=i+1 ; j<a.size() ; j++)
            {
                if (a.get(i) == a.get(j))
                    a.remove(j) ;
            }
        }
        
        System.out.println("After remove duplicate value : "+a);
    }
}