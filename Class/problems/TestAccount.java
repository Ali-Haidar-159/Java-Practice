
package problems ;

public class TestAccount 
{
    public static void main (String [] args)
    {
        Account ac = new Account (101,25000,4) ;
        ac.deposite(10000);
        if (ac.withdraw(3000) == true)
        {
            System.out.println("Withdraw successfully completed.");
            System.out.println("Time : "+java.time.LocalDateTime.now());
        }
        else 
            System.out.println("Withdraw not completed .");
        
        ac.display();
        System.out.println("Total amount : "+ac.ammountWithInterest(1));//1 maser lav
        
        
        //another obj : 
        
        Account ac2 = new Account () ;
        ac2.setId(8989);
        ac2.setBalance(50000);
        ac2.setInterestRate(6);
        
        ac2.deposite(50000);
        if (ac2.withdraw(20000)==true)
        {
            System.out.println("\n\nWithdraw Successfully completed.") ;
            System.out.println("Time : "+java.time.LocalDateTime.now());
        }
        else 
            System.out.println("Withdraw not completed.");
        
        System.out.println("\nId : "+ac2.getId()+"\nBalance : "+ac2.getBalance()+"\nInterest rate : "+ac2.getInterestRate());
        System.out.println("total amount : "+ac2.ammountWithInterest(2));//2 maser lav
        
    }
}