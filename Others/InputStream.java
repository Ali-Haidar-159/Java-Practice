package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputStream 
{

    public static void main(String[] args) 
    {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader x = new BufferedReader(r);

        String name, id, salary;

        try 
        {
            System.out.print("Enter name : ");
            name = x.readLine();
            System.out.print("Enter id : ");
            id = x.readLine() ;
            System.out.print("Enter salary : ");
            salary = x.readLine() ;
                    
            System.out.println("\nName : "+name) ;
            System.out.println("Id : "+id);
            System.out.println("Salary : "+salary);
            
            int n ;
            n = Integer.parseInt(id) ;
            
            System.out.println("\nNumber is : "+(n+1));
        }
        catch (Exception e)
        {
            System.out.println("Exception is : "+e);
        }


    }
}
