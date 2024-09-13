
package basic;

public class Check 
{
    public static void main (String [] args)
    {
        int i , sum=0 ;
        int [] a = {2,0,1,10,-11,25,10,-5,10,20,10} ;
        
        for (i=0 ; i<a.length ; i++)
        {
            if (a[i] == 10)
                sum+= a[i] ;
        }
        
        System.out.println(sum==30 ? "True" : "False");
    }
}