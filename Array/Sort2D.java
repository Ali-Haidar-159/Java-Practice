
package basic ;

public class Sort2D
{
    public static void main (String [] args)
    {
        int i , j , apple ; 
        
        int [][] a = { {1,2,3},
                       {4,5,6},
                       {7,6,8}  
                     };
        
        for (i=0 ; i<a.length ; i++)
        {
            for (j=0 ; j<a[i].length-1 ; j++)
            {
                if (a[i][j] > a[i][j+1])
                {
                    apple = a[i][j] ;
                    a[i][j] = a[i][j+1] ;
                    a[i][j+1] = apple ; 
                }
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