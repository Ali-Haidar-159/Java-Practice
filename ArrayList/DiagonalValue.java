
package basic ;

import java.util.ArrayList;
import java.util.Scanner;

public class DiagonalValue 
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in );
        
        int i , j , n ;
        
        ArrayList <ArrayList<Integer>> p = new ArrayList <> (3) ;
        
        ArrayList <Integer> m1 = new ArrayList <Integer> () ;
        ArrayList <Integer> m2 = new ArrayList <Integer> () ;
        ArrayList <Integer> m3 = new ArrayList <Integer> () ;
        
        p.add(m1) ;
        p.add(m2) ;
        p.add(m3) ;
        
        for (i=0 ; i<p.size() ; i++)
        {
            for (j=0 ; j<3 ; j++)
            {
                System.out.printf("Enter the number p[%d][%d] : ",i,j);
                n = x.nextInt() ;
                p.get(i).add(n) ;
            }
        }
        
        for (i=0 ; i<p.size() ; i++)
        {
            for (j=0 ; j<p.get(i).size() ; j++)
            {
                System.out.print(" "+p.get(i).get(j));
            }
            System.out.println();
        }     
        
        for (i=0 ; i<p.size() ; i++)
        {
            for (j=0 ; j<p.get(i).size() ; j++)
            {
                if (i == j)
                {
                    System.out.println("The diagonal value is : "+p.get(i).get(j));
                }
            }
        }
        
    }
}
