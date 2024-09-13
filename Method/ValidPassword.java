
package basic ;

import java.util.Scanner;

public class ValidPassword 
{
    public static int checkPass (String s)
    {
        int i , total=0 , letter=0 , digit=0 , length ;
        char c ;
        
        for (i=0 ; i<s.length() ; i++)
        {
            c = s.charAt(i) ;
            
            if (Character.isAlphabetic(c))
                letter ++ ;
            else if ((Character.isDigit(c)))
                digit++ ;
            else 
                return 0 ;
        }
        
        length = s.length() ;
        
        if (length==8 && digit>=2)
            return 1 ;
        else
            return 0 ;
    }
    
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in) ;
        
        int n ;
        String pass ;
        
        System.out.print("Enter a password : ");
        pass = x.nextLine() ;
        
        n = checkPass(pass) ;
        
        System.out.println(n==1 ? "Correct password" : "Wrong password\n"
                                    + "1. A password must have at least eight characters\n" +
                                      "2. A password consists of only letters and digits.\n" +
                                      "3. A password must contain at least two digits");
        
    }
}