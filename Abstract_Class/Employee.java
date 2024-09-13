
package basic ;

abstract class Employee 
{
    String name ;
    int id ;
    double salary ;
    
    Employee (String name , int id , double salary)
    {
        this.name = name ;
        this.id = id ;
        this.salary = salary ;
    }
    
    void text ()
    {
        System.out.println("This is non abstract or normal method .");
    }
    
    abstract void calculateSalary () ;
    abstract void displayInfo () ;
    
}