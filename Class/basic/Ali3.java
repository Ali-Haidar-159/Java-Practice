
package basic ;

class Ali3 
{
    String name ; 
    int id ;
    double salary ;
    
    Ali3()
    {
        System.out.println("Hello World. I am default constructor .");
    }
    
    Ali3 (String n , int i , double s)
    {
        name = n ;
        id = i ;
        salary = s ;
    }
    
    void display ()
    {
        System.out.println("Name is - "+name);
        System.out.println("Id is - "+id);
        System.out.println("Salary is - "+salary);
    }
}