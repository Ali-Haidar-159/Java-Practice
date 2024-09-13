
package basic_2 ;

class Person 
{
    private String name ;
    private int id ;
    private double salary ;
        
    public void setName (String name)
    {
        this.name = name ;
    }
    
    public void setID (int id)
    {
        this.id = id ;
    }
    
    public void setSalary (double salary)
    {
        this.salary = salary ;
    }
    
    public String getName ()
    {
        return  name ;
    }
    
    public int getId ()
    {
        return id ;
    }
    
    public double getSalary ()
    {
        return salary ;
    }
    
    void setValues (String name ,int id , double salary)
    {
        this.name = name ;
        this.id = id ;
        this.salary = salary ;
    }
    
    void getAllValues()
    {
        System.out.println(System.lineSeparator() + "Name is : "+name);
        System.out.println("Id is : "+id);
        System.out.println("Salary is : "+salary);
    }
    
}