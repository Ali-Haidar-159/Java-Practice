
package basic_2 ;

class Student 
{
    String name ;
    int id ;
    double gpa ;
    static int counter=0 ;
    
    Student (String name , int id)
    {
        this.name = name ;
        this.id = id ;
    }
    
    Student (String name , int id , double gpa)
    {
        this(name , id) ;
        this.gpa = gpa ;
        counter ++ ;
    }
    
    void display ()
    {
        System.out.println(System.lineSeparator() + "Name : "+name);
        System.out.println("Id : "+id) ;
        System.out.println("Gpa : "+gpa);
        System.out.println("Student no : "+counter);
    }
}