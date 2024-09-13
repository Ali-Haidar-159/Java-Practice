
package basic ;

class Account extends Bank
{
    //balace , deposite() , withdraw() ;
    
    Account (double balance)
    {
        super(balance) ;
    }
    
    void deposite (double amount)
    {
        balance+= amount ;
    }
    
    void withdraw(double amount)
    {
        balance-= amount ;
    }
    
    public String toString ()
    {
        return "Balance is : "+balance ;
    }
}