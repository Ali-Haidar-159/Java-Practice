
package non_static ;

abstract class Person
{
    String name ;
    int id ;
    
    Person (String name , int id)
    {
        this.name = name ;
        this.id = id ;
    }
    
    void display ()
    {
        System.out.println("This is abstract class .");
    }
    
    abstract void message2 () ;
}