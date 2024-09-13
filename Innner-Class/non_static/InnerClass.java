
package non_static ;

class Ali 
{
    String name ; 
    int id ;
    static int flag=0;
    
    void set (String name , int id)
    {
        this.name = name ;
        this.id = id ;
        flag++ ;
    }
    
    void printInfo()
    {
        System.out.println("\t\tPerson : "+flag);
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
    }
    
    class Haidar 
    {
        //name , id , srt() , printInfo() ; 
        
        double salary ;
        
        Haidar (String name , int id , double salary)
        {
            set(name , id) ;
            this.salary = salary ;
        }
        
        void printInfo2()
        {
            printInfo () ;
            System.out.println("Salary : "+salary+System.lineSeparator());
        }
    }
            
}