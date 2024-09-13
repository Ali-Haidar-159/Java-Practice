
package basic ;

class Manager implements Man , Banker 
{
    //name , age , post , salary , `msg() , `printInfo() , `msg2() , test();
    
    double bonus ; 
    
    Manager (double bonus)
    {
        this.bonus = bonus ;
    }
    
    public void msg ()
    {
        System.out.println("This is in Man interface .");
    }
    
    public void msg2 ()
    {
        System.out.println("This is in Banker interface.");
    }
    
//    public void test ()
//    {
//        System.out.println("This is override method");
//    }
    
    public void printInfo ()
    {
        System.out.println("Post : "+post);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
        System.out.println("Bonus : "+bonus) ;
    }
    
}