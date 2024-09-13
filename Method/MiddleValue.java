
package basic ;

import java.util.Scanner;

public class MiddleValue 
{
    public static String middleValue (String ss)
    {
        String value ;
        int length = ss.length();
        
        if (length % 2 ==0)
        {
            int l = length/2 ;
            value = ss.substring(l-1, l+1) ;
        }
        else 
        {
            char c = ss.charAt(length/2) ;
            value = Character.toString(c) ;
        }

        return value ;
    }
    
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in );
        String s  ;
        
        System.out.print("Enter a string : ");
        s = x.next( );
        
        s = middleValue(s) ;
        
        System.out.println("The middle value is := "+s);
        
        
    }
}