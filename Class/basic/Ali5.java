
package basic ;

import java.util.Scanner;

class Ali5
{
    String name ;
    int id ;
    double salary ;
    
    Ali5()
    {
        Scanner x = new Scanner (System.in );
        
        System.out.print("Enter your name : ");
        name = x.nextLine() ;
        System.out.print("Enter your own id : ");
        id = x.nextInt() ;
        System.out.print("Enter your salary : ");
        salary = x.nextDouble() ;        
    }
    
    void diss ()
    {
        System.out.println("\nName : "+name);
        System.out.println("Id : "+id);
        System.out.println("Salary : "+salary);
    }
}