
package Comperable ;

class Person implements Comparable<Person>
{
    String name ;
    int id ;
    double salary ;
    
    Person (String name , int id , double salary)
    {
        this.name = name ;
        this.id = id ;
        this.salary = salary ;
    }
    
    void print ()
    {
        System.out.println("Name : "+name);
        System.out.println("Id : "+id );
        System.out.println("Salary : "+salary) ;
    }
    
    public int compareTo(Person obj)
    {
        if (this.id > obj.id)
            return 1 ;
        else if(this.id < obj.id)
            return -1 ;
        else 
        {
            if (this.salary > obj.salary)
                return 1 ;
            else if (this.salary < obj.salary)
                return -1 ;
            else 
                return 0 ;
        }
    }
}