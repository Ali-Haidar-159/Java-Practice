
package basic ;

public class Diagonals 
{
    public static void main (String [] args)
    {
        int i , j , sum=0 ;
        
        int [][] a = { {1,2,3},
                       {4,5,6},
                       {7,6,8}  
                     };
        
        for (i=0 ; i<a.length ; i++)
        {
            for (j=0 ; j<a[i].length ; j++)
            {
                if (i == j)
                {
                    System.out.print(" "+a[i][j]);
                    sum += a[i][j] ;
                }

            }
        }
        
        System.out.println("\nThe sum is : "+sum);
    }   
}