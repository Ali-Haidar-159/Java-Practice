
package basic ;

import java.util.Arrays;

public class RemoveDuplicate
{
    public static void main (String [] args)
    {
        int [] aa = {10,30,20,40,30,50,60} ;
        int i , j , k  ;
        
        System.out.println(Arrays.toString(aa)); 
        
        for (i=0 ; i<aa.length ; i++)
        {
            for (j=i+1 ; j<aa.length ; j++)
            {
                if (aa[i] == aa[j])
                {
                    for (k=i ; k<aa.length-1 ; k++)
                    {
                        aa[k] = aa[k+1] ;
                    }
                }
            }
        }
        
        //System.out.println("After : "+Arrays.toString(aa));
        
        for(i=0 ; i<aa.length-1 ; i++)
        {
            System.out.print(aa[i]+" ");
        }
    }
}