
package basic ;

class Employee
{
    int salary ; 
    
    Employee (int salary)
    {
        this.salary = salary ;
    }
    
    void work ()
    {
        System.out.println("This is our work method.");
    }
    
    void display ()
    {
        System.out.println("The salary is : "+salary);
    }
}