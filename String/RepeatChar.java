
package basic ;

public class RepeatChar
{
    public static void main (String [] args)
    {
        String s = "succccessesee" ;
        int i , j , apple=0 , c=0 , c1=0 ;
        char ch = 0 , ch2 = 0 ; 
        
        
        for (i=0 ; i<s.length() ; i++)
        {
            c = 0 ;
            for (j=i+1 ; j<s.length()-1 ; j++)
            {
                if (s.charAt(i) == s.charAt(j))
                    c++ ; 
            }
            if (c > apple)
            {
                apple = c ; 
                ch = s.charAt(i) ;
            } 
            else if (c == apple)
                c1++ ;
                
        }
        if (c1 != 0)
            System.out.println("Same number of character are present .");
        else 
            System.out.println("Most repeated character is : "+ch);
        
    }
}