
package basic ;

class Programmer extends Employee
{
    //name , id , salary , text() , calculateSalary() , displayInfo () ;
    
    double medicalCharge ;
    int overTime ;
    
    Programmer (String name , int id , double salary , double medicalCharge , int overTime)
    {
        super (name , id , salary) ;
        this.medicalCharge = medicalCharge ;
        this.overTime = overTime ;
    }
    
    void calculateSalary ()
    {
        salary = salary+medicalCharge+(100*overTime) ;
    }
    
    void displayInfo ()
    {
        System.out.println(" : Programmer : ");
        System.out.println("Name : "+name);
        System.out.println("Id :"+id);
        System.out.println("Salary : "+(salary-(medicalCharge+(100*overTime))));
        System.out.println("Extra salary : "+(medicalCharge+(100*overTime))) ;
        System.out.println("Total salary : "+salary+System.lineSeparator());
    }
}