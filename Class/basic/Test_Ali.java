
package basic ;

public class Test_Ali
{
    public static void main (String [] args)
    {
        Ali p1 ;
        p1 = new Ali () ;
        
        p1.id = 100 ;
        p1.name = "Karim" ;
        p1.salary = 50000 ;
        
        System.out.println("Name : "+p1.name) ;
        System.out.println("Id : "+p1.id);
        System.out.println("Salary : "+p1.salary);
    }
}