
package basic2 ;

class Person 
{
    String name ; 
    int id ;
    
    Person (String name , int id)
    {
        this.name = name ;
        this.id = id ;
    }
    
    void dis()
    {
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
    }
}