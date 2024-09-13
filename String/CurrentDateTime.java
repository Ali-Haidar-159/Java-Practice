
package basic ;

import java.util.Calendar;

public class CurrentDateTime 
{
    public static void main (String [] args)
    {
        Calendar c = Calendar.getInstance() ;
       
        System.out.printf("%tB %te, %tY\n", c, c, c);
        System.out.printf("%tl : %tm : %tp\n",c,c,c) ;
        
        System.out.println(c.getTime());
        
        
    }
}