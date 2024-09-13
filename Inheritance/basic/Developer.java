
package basic ;

class Developer extends Employe
{
    // name , id , address , jobTitle , salary , display(), report() ;
    
    int medical_Charge ; 
    double rent ;
    double grade ; 
    
    Developer (String name,int id,String address,String jobTitle,double salary,int medical_charge,double rent ,double grade)
    {
        super (name , id , address,jobTitle,salary) ;
        this.medical_Charge = medical_charge ;
        this.rent = rent ;
        this.grade = grade ;
    }
    
    double totalSalary ()
    {
        double x = (salary/100)*grade ;
        return x+salary+medical_Charge+rent ;
    }
    
    void report ()
    {
        System.out.println(this.name +" good performance .");
    }
    
    void displayInfo ()
    {
        super.displayInfo(); 
        System.out.println("Total salary : "+this.totalSalary()) ;
    }
}