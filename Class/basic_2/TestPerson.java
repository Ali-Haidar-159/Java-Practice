
package basic_2 ;

public class TestPerson
{
    public static void main (String [] args)
    {
        Person p1 = new Person () ;
        p1.setName("Abdul jabbar");
        p1.setID(101);
        p1.setSalary(50000);
        
        System.out.println("Name : "+p1.getName());
        System.out.println("Id : "+p1.getId());
        System.out.println("Salary : "+p1.getSalary());
        
        Person p2 = new Person () ;
        p2.setValues("Sofiqul", 102, 60000);
        p2.getAllValues();
    }
}