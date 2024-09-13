
package bankManagement ;

import java.util.Scanner;

class BankAccount 
{
    String name ;
    int nid , numberOfPersonalAccount ;
    String phoneNumber ;
    double interestRate ;
    
    PersonalAccount [] pa = new PersonalAccount[3] ;
    
    int j , i ;
    
    BankAccount (String name,int nid,String phoneNumber,double interestRate,int numberOfPersonalAccount)
    {
        this.name = name ;
        this.nid = nid ;
        this.phoneNumber = phoneNumber ;
        this.interestRate = interestRate ;
        this.numberOfPersonalAccount = numberOfPersonalAccount ;
    }
    
    void initializePA ()
    {       
        double balance ;
        for (i=0 ; i<numberOfPersonalAccount ; i++)
        {
            Scanner x = new Scanner (System.in);
            
            System.out.print("Enter balance : ");
            balance = x.nextDouble() ;
                       
            pa[i] = new PersonalAccount (balance) ;
        }
        
    }
    
    void displayBankAccount ()
    {
        System.out.println(System.lineSeparator() + "Name : "+name);
        System.out.println("NID : "+nid);
        System.out.println("Mobile Number : "+phoneNumber);
        System.out.println("Interest Rate : "+interestRate);
        
        for (j=0 ; j<this.numberOfPersonalAccount ; j++)
        {
            pa[j].displayPersonalAccount();
        }
    }
}