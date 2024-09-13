
package basic ;

class Manager extends Employee
{
    //salary , work() , display() ;
    
    public Manager(int salary) 
    {
        super(salary);
    } 
    
    void work ()
    {
        System.out.println("This is manager");
    }
    
    void addEmployee ()
    {
        System.out.println("We ar adding new employee .");
    }
    
    void dis ()
    {
        super.display();
    }
    
}