
package basic ;

import java.util.Scanner;

public class Char_array
{
    public static void main (String [] args)
    {
        char [] ch = new char [5] ;
        
        int i ; 
        
       Scanner x = new Scanner (System.in );
       
       System.out.println("Enter values : ");
       
       for (i=0 ; i<ch.length ; i++)
       {
           ch[i] = x.next().charAt(0) ;
       }
        
       for (char v : ch)
       {
           System.out.print(v + " ");
       }
    }
        
    }