package basic;

public class TestManagerProgrammer {

    public static void main(String[] args) 
    {
        Employee e1;
        
        e1 = new Manager("Atif", 101, 50000,15000);
        e1.calculateSalary();
        e1.displayInfo();
        
        e1 = new Programmer("Anis",601,50000,10000,5) ;
        e1.calculateSalary();
        e1.displayInfo();
    }
}
