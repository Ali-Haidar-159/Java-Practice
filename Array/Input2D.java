
package basic ;

import java.util.Scanner;

public class Input2D 
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in );
        
        int i ,j , row , column ;
        
        System.out.print("Enter row size : ");
        row = x.nextInt() ;
        System.out.print("Enter column size : ") ;
        column = x.nextInt() ;
        
        int [][] aa = new int [row][column] ;
        
        for (i=0 ; i<row ; i++)
        {
            for(j=0 ; j<column ; j++)
            {
                System.out.printf("Enter [%d][%d] : ",i,j);
                aa[i][j] = x.nextInt() ;
            }
        }
        for (i=0 ; i<row ; i++)
        {
            for (j=0 ; j<column ; j++)
            {
                System.out.print(" "+aa[i][j]);
            }
            System.out.println(); 
        }
    }
}