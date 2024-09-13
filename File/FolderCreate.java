
package basic ;

import java.io.File;

public class FolderCreate 
{
    public static void main (String [] args)
    {
        File f = new File ("C:/Users/we/Desktop/TestFile") ;
        
        try 
        {
            if (f.mkdir() == true)
                System.out.println("Folder created");
            else 
                System.out.println("Folder not created.");
        }
        catch (Exception e)
        {
            System.out.println("Exception is : "+e);
        }
    }
}