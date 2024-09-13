
package basic ;

import java.time.LocalDate ;
import java.time.LocalDateTime;
import java.time.LocalTime ;

public class DateTime 
{
    public static void main (String [] args)
    {
        // First Way : 
        
        LocalDate d = LocalDate.now() ;
        LocalTime t = LocalTime.now() ;
        
        int hour , mint , second , year , month , day ;
        
        year = d.getYear() ;
        month = d.getMonthValue() ;
        day = d.getDayOfMonth() ;
        
        hour = t.getHour() ;
        mint = t.getMinute() ;
        second = t.getSecond() ;
        
        System.out.println("Date : "+day+"-"+month+"-"+year);
        System.out.println("Time : "+hour+" : "+mint+" : "+second);
        
        //Second Way : 
        
        System.out.println("Date is : "+java.time.LocalDate.now());
        System.out.println("Time is : "+java.time.LocalTime.now());

    }
}