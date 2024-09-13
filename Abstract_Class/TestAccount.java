
package basic ;

public class TestAccount 
{
    public static void main (String [] args)
    {
        Bank p1 = new Account (25000) ;
        
        System.out.println("Starting "+p1);
        
        p1.deposite(10000);
        System.out.println("After deposite "+p1);
        
        p1.withdraw(3000);
        System.out.println("After withdraw "+p1);
    }
}