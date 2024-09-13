
package basic_2 ;

public class Test_Emp
{
    public static void main (String [] args)
    {
        Employee p1 = new Employee("Jabbar", 121, 50000) ;
        p1.printInfo();
        
        Employee p2 = new Employee (p1) ;
        //p2.name = "Zamal" ;
        p2.printInfo();
        
    }
}