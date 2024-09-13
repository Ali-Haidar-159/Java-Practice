
package basic ;

public class MaxProductPair 
{
    public static void main (String [] args)
    {
        int i , j , maxPro = 1 , v1=0 , v2=0 ;
        
        int [] a = {1,2,6,10,9,7,4,1,5,2} ;
        
        for (i=0 ; i<a.length ; i++)
        {
            for (j=i+1 ; j<a.length ; j++)
            {
                if (a[i]*a[j] > maxPro)
                {
                    maxPro = a[i] * a[j] ;
                 v1 = a[i] ;
                 v2 = a[j] ;
                }
            }
        }
        
        System.out.format("The max product is : %d\n",maxPro) ;
        System.out.printf("The pair is : %d %d",v1,v2) ;
    }
}