
package bankManagement ;

import java.util.ArrayList;
import java.util.Scanner;

public class Test 
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in);
        
        int i , openAccount ;
        
        int nid  , numberOfPersonalAccount  ;
        String phoneNumber , name ;
        double interestRate ;
        
        ArrayList <BankAccount> list = new ArrayList <BankAccount> () ;
        
        System.out.print("How many account : ");
        openAccount = x.nextInt() ;
        
        for (i=0 ; i<openAccount ; i++)
        {
            System.out.print("Enter your name : ");
            name = x.next() ; 
            System.out.print("Enter your NID number : ");
            nid = x.nextInt() ;
            System.out.print("Enter mobile number to varify : ");
            phoneNumber = x.next() ;
            System.out.print("Enter the rate of interest : ");
            interestRate = x.nextDouble() ;
            System.out.print("One user can open 3 accout .\nHow many account you want to open :");
            numberOfPersonalAccount = x.nextInt() ;
            
            BankAccount packet = 
                    new BankAccount(name, nid, phoneNumber, interestRate,numberOfPersonalAccount);
            
            list.add(packet) ;
            list.get(i).initializePA();
        }
        
        for (i=0 ; i<list.size() ; i++)
        {
            list.get(i).displayBankAccount();
        }

    }
}