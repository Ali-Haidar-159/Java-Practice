
package basic ;

public class RemoveDuplicateChar
{
    public static void main (String [] args)
    {
        String newString = null , s = "w3rsouce" ;
        int i , j ;
        
        for (i=0 ; i<s.length() ; i++)
        {
            for (j=i+1 ; j<s.length()-1 ; j++)
            {
                if (s.charAt(i) == s.charAt(j))
                    newString = s.substring(0, i)+ s.substring(j)  ;
            }
        }
        
        System.out.println (newString) ;
        
    }
}