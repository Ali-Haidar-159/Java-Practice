package basic;

import java.util.Scanner;

public class Test_Emp_Mana_Deve {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String name, address, jobTitle;
        int id, medical_charge , percentage ;
        double rent, grade, salary ;
        char c;
        
        
        System.out.println("1.Manager \n2.Developer \n3.Employee");
        System.out.print("Enter the first character : ");
        c = x.next().charAt(0);
        
        System.out.print("\nEnter name : ");
        name = x.next();
        System.out.print("Enter id : ");
        id = x.nextInt();
        System.out.print("Enter address : ");
        address = x.next();
        System.out.print("Enter your job title : ");
        jobTitle = x.next();
        System.out.print("Enter your salary : ");
        salary = x.nextDouble();

        switch (c) 
        {
            case 'm':
                System.out.print("Enter percentage : ");
                percentage = x.nextInt() ; 
                managr m = new managr (name , id , address , jobTitle , salary , percentage);
                m.displayInfo();
                m.report();
                break ; 
            case 'd' : 
                System.out.print("Enter medical charge : ");
                medical_charge = x.nextInt() ;
                System.out.print("Enter rent : ");
                rent = x.nextDouble() ;
                System.out.print("Enter grade : ");
                grade = x.nextDouble() ;
                
                Developer d = new Developer (name , id , address , jobTitle, salary, medical_charge , rent, grade) ;
                
                d.displayInfo();
                d.report();
                break ;
            case 'e' : 
                Employe e = new Employe(name, id, address, jobTitle, salary) ;
                e.displayInfo();
                e.report();
                break ;
            default :
                    System.out.println("Enter the right command .");
        }
    }
}
