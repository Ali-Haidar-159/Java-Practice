
package basic_2 ;

class Employee 
{
    String name ; 
    int id ;
    double salary ;
    static int counter =0 ;
    
    Employee (String name , int id , double salary)
    {
        this.name = name ;
        this.id = id ;
        this.salary = salary ;
        counter++ ;
    }
    
    //obj copy 
    Employee (Employee e)
    {
        this.name = e.name ;
        this.id = e.id ;
        this.salary = e.salary ;
        counter++ ;
    }
    
    void printInfo ()
    {
        System.out.println(System.lineSeparator() + "For "+counter+" obj :");
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Salary : "+salary);
    }
}
