
package basic ;

import java.util.Scanner;

public class WordCount
{
    public static int WordCount (String s)
    {
        int c=1 , i ;
       
        for (i=0 ; i<s.length() ; i++)
        {
            if (s.charAt(i) == ' ')
                c++ ;
        }
        
        return  c ;
    }
    
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in );
        String s ;
        
        System.out.format("Enter a String : ") ;
        s = x.nextLine() ;
        
        int wordNo = WordCount(s) ;
        
        System.out.println("Total : "+wordNo+" words.");
    }
}