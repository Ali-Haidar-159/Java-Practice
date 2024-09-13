
package basic ;

class Ali7
{
    String name ;
    int id ;
    double salary ; 
    
    Ali7 (String n , int i , double s)
    {
        name = n ; 
        id = i ; 
        salary = s ;
    }
    
    void display ()
    {
        System.out.println(System.lineSeparator() + "Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Salary : "+salary);
    }
}