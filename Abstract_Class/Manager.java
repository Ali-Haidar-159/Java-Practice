
package basic ;

class Manager extends Employee
{
    //name , id , salary , text() , calculateSalary() , displayInfo() ;
    
    double bonus ;
    
    Manager(String name , int id , double salary , double bonus)
    {
        super (name , id , salary) ;
        this.bonus = bonus ;
    }
    
    void calculateSalary ()
    {
        salary += bonus ;
    }
    
    void displayInfo ()
    {
        System.out.println(" : Manager :  ");
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Salary : "+(salary-bonus)); // karon calculateSalary k call deyar 
        System.out.println("Bonus : "+(bonus));         //por bonus ta add hye gechilo.
        System.out.println("Total salary : "+salary+System.lineSeparator());
    }
}