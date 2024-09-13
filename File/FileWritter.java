
package basic ;

import java.io.FileWriter;

public class FileWritter 
{
    public static void main (String [] args)
    {
        int roll = 100 ;
        try
        {
            FileWriter w = new FileWriter("C:/Users/we/Desktop/TestFile/student.txt",true) ;
            
            w.write("\n East West University .\tBanasree");
            
            w.close();
        }
        catch (Exception e)
        {
            System.out.format("Exception is : "+e+System.lineSeparator()) ;
        }
    }
}