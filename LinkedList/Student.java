
package Basic ;

class Student 
{
    String name ;
    int id ; 
    double gpa ;
    
    Student (String name , int id , double gpa)
    {
        this.name = name ;
        this.id = id ; 
        this.gpa = gpa ;
    }
    
    void display ()
    {
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Gpa : "+gpa+System.lineSeparator());
    }
}