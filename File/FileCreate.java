
package basic ;

import java.io.File;

class FileCreate
{
    public static void main (String [] args)
    {
        File f = new File ("C:/Users/we/Desktop/TestFile/student.txt") ;
        
        try 
        {
            if (f.createNewFile() == true)
                System.out.println("File is created.");
            else 
                System.out.println("File is not created.");
        }
        catch (Exception e)
        {
            System.out.println("Exception is : "+e);
        }
    }
}