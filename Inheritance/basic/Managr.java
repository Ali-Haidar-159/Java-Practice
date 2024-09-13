
package basic ;

class managr extends Employe
{
    //name , id , address , salary , jobtitle , displayInfo() , report( ) ;
    
    int percentage ;
    
    managr (String name , int id , String address , String jobTitle , double salary , int percentage)
    {
        super (name,id,address,jobTitle,salary) ;
        this.percentage = percentage ;
    }
    
    double bonus ()
    {
        return (salary/100)*percentage ;
    }
    
    double totalSalary ()
    {
       return bonus()+salary ;
    }
    
    void report ()
    {
        System.out.println(this.name + " is very good .");
    }
    
    void displayInfo ()
    {
        super.displayInfo();
        System.out.println("Total salary : "+totalSalary());
    }
}