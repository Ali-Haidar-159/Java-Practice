
package problems ;

import java.time.LocalDateTime;

class Account 
{
    private int id ;
    private double balance ;
    private double interestRate ;
    
    Account ()
    {
        //System.out.println("This is default constructor.");
    }
    
    Account (int id , double balance , double interestRate)
    {
        this.id = id ;
        this.balance = balance ;
        this.interestRate = interestRate ;
    }
    
    public void setId (int id)
    {
        this.id = id;
    }
    
    public void setBalance (double balance)
    {
        this.balance = balance ;
    }
    
    public void setInterestRate (double interestRate)
    {
        this.interestRate = interestRate ;
    }
    
    boolean withdraw (double amount)
    {
        if (balance >= amount)
        {
           balance = balance - amount ;
           return true ;
        }
        else 
            return false ;        
    }
    
    void deposite (double amount)
    {
        balance += amount ;
    }
    
    double ammountWithInterest (int month)
    {
        return (interestRate*balance*month)/(interestRate/2) ;
    }
    
    void display ()
    {
        System.out.println(System.lineSeparator() + "Id : "+id);
        System.out.println("Current balance : "+balance) ;
        System.out.println("Interest rate : "+interestRate);
    }
    
    public int getId ()
    {
        return this.id ;
    }
    
    public double getBalance ()
    {
        return this.balance ;
    }
    
    public double getInterestRate ()
    {
        return this.interestRate ;
    }
    
}