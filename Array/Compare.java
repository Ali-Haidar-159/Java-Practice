
package basic ;

public class Compare 
{
    public static void main (String [] args)
    {
        int [] arr1 = {10,20,30,60,50} ;
        int [] arr2 = {10,20,30,40,50} ;
        
        int i  , flag=0 ;
        
        for (i=0 ; i<arr1.length ; i++)
        {
            if (arr1[i] != arr2[i])
                flag++ ;
        }
        
       System.out.println(flag==1 ? "Not Equal" : "Equal");
    }
}