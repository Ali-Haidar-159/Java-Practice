
package Comperable ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestPerson
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in) ;
        
        String name ;
        int id , i , n ;
        double salary ;
        
        System.out.print("Enter how many people : ");
        n = x.nextInt() ;
        
        ArrayList <Person> m = new ArrayList <Person> ();
        
        for (i=0 ; i<n ; i++)
        {
            System.out.print("Enter name : ");
            name = x.next() ;
            System.out.print("Enter id : ");
            id = x.nextInt() ;
            System.out.print("Enter salary : ");
            salary = x.nextDouble() ;
            
            Person pack = new Person (name , id , salary) ;
            
            m.add(pack) ;
        }
        
        System.out.println("\nBefore sort : \n");
        for (Person v : m)
        {
            v.print();
        }
        
        Collections.sort(m);
        
        System.out.println("\nAfter sort : \n");
        
        for (Person v : m)
        {
            v.print();
        }
    }
}