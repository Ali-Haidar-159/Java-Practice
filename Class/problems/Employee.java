
package problems ;

class Employee 
{
    String name ; 
    int id ;
    double salary ;
    
    Employee (String n , int i , double s)
    {
        name = n ;
        id = i ;
        salary =  s ;
    }
    
    void bonusSalary (int percentage)
    {
        System.out.println("Bonus : " +(salary/100) * percentage + System.lineSeparator());
    }
    
    void display ()
    {
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Basic salary : "+salary);
    }
}