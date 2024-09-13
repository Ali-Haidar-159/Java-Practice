
package basic ;

class Ali4 
{
    String name ;
    int id ;
    double salary ;
    
    Ali4 (String n , int i , double s) // value initialiZe korar jonno constructor nilam 
    {
        name = n ; 
        id = i ; 
        salary = s ;
    }
    
    void disValue () // value gula print korar jonno method 
    {
        System.out.println("Name : "+name);
        System.out.println("Id : "+id) ;
        System.out.println("Salary : "+salary);
    }
}