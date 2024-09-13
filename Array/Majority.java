
package basic ;

public class Majority 
{
    public static void main (String [] args)
    {
        int i , j , flag=0 , c=0 , num=0 ;
        int [] a = {1,2,2,7,5,3,3,3,3,3,3,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,8} ;
        
        for (i=0 ; i<a.length ; i++)
        {
            c = 0 ;
            for (j=i ; j<a.length ; j++)
            {
                if (a[i] == a[j])
                    c++ ;
            }
            if (c > flag)
            {
                flag  =  c ;
                num = a[i] ;
            }    
        }
        
        System.out.println("The majority number is : "+num);
    }
}