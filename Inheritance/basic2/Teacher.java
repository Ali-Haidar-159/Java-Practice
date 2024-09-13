
package basic2 ;

class Teacher extends Person
{
    //name , id , dis() ;
    
    double salary ;
    
    Teacher (String name , int id , double salary)
    {
        super(name , id) ;
        this.salary = salary ;
    }
    
    void dis()
    {
        super.dis();
        System.out.println("Salary : "+salary);
    }
}