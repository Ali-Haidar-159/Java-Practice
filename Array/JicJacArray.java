
package basic ;

import java.util.Scanner;

public class JicJacArray 
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in);
        
        int c , r , i , j ;
        
        System.out.print("How many row : ");
        r = x.nextInt() ;
        
        int [][] a = new int [r][] ;
        
        for (i=0 ; i<r ; i++)
        {
            System.out.print("Enter the column number of row "+(i+1)+" : ");
            c = x.nextInt() ;
            a[i] = new int [c] ;
        }
        
        for (i=0 ; i<a.length ; i++)
        {
            for (j=0 ; j<a[i].length ; j++)
            {
                System.out.printf("Enter the value a[%d][%d] : ",i,j);
                a[i][j] = x.nextInt() ;
            }
        }
        
        for (i=0 ; i<a.length ; i++)
        {
            for (j=0 ; j<a[i].length ; j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println(); 
        }

        
    }
}