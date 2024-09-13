
package problems ;

public class Test_Employee
{
    public static void main (String [] args)
    {
        Employee p1 = new Employee("Abdul jabbar",1212,50000) ;
        p1.display();
        p1.bonusSalary(20);
        
        Employee p2 = new Employee("jakaria",3223,50000) ;
        p2.display(); 
        p2.bonusSalary(19);
    }
}