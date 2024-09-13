
package basic ;

class Employe
{
    String name ;
    int id ;
    String address ; 
    String jobTitle ;
    double salary ;
    
    Employe ()
    {
        System.out.println("This is default constructor");
    }
    
    Employe (String name , int id)
    {
        this.name = name ;
        this.id = id ;
    }
    
    Employe (String name , int id , String address , String jobTitle , double salary)
    {
        this (name , id) ;
        this.address = address ;
        this.jobTitle = jobTitle ;
        this.salary = salary ;
    }
    
//    double bonus ()
//    {
//        return 0.0 ;
//    }
//    
//    double totalSalary ()
//    {
//        return 0.0 ;
//    }
    
    void report ()
    {
        System.out.println("Print report of Employee.");
    }
    
    void displayInfo ()
    {
        System.out.println(System.lineSeparator() + "Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Address : "+address);
        System.out.println("Job title : "+jobTitle);
        System.out.println("Basic salary : "+salary);
    }
}