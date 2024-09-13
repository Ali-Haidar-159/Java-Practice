
package bankManagement ;

import java.util.Random;

class PersonalAccount 
{
    int accountNumber ; 
    double balance ;
    
    PersonalAccount (double balance)
    {
        Random rand = new Random () ;
        int rand2 = rand.nextInt(9874)+4398 ;
        this.accountNumber = rand2 + 46454 ;
        this.balance = balance ;
    }
    
    void displayPersonalAccount()
    {
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Balance : "+balance);
    }
}