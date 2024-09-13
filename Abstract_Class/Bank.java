
package basic ;

abstract class Bank 
{
    double balance ; 
    
    Bank (double balance)
    {
         this.balance = balance ;
    }
    
    abstract void deposite (double amount) ;
    abstract void withdraw (double amount) ;
}

