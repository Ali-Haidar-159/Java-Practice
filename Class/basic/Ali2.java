
package basic ;

class Ali2 
{
    String name ;
    int id ;
    double salary ;
    
    void set (String n , int i , double s)
    {
        name = n ; 
        id = i ; 
        salary = s ;
    }
    
    void dis ()
    {
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("salary : "+salary);
    }
    
}