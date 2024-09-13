
package basic ;

public class SecondLargeNum
{
    public static void main (String [] args)
    {
        int [] arr = {10,66,40,30,99,85,70 , 110} ;
        int i , large , secondLarge ;
        
        large = arr[0] ;
        
        for (i=0 ; i<arr.length ; i++)
        {
            if (large < arr[i])
                large = arr[i] ;
        }
        
        System.out.println("The large number is : "+large);
        
        secondLarge = arr[0] ;
        for (i=0 ; i<arr.length ; i++)
        {
            if (arr[i] > secondLarge)
            {
                if(arr[i] == large)
                    continue;
                else 
                    secondLarge = arr[i] ;
            }
        }
        
        System.out.println("The second large number is : "+secondLarge);
    }
}
