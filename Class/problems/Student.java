
package problems ;

import java.util.ArrayList;

class Student 
{
    String name ;
    int id ; 
    double credit ; 
    ArrayList <String> course = new ArrayList <String> () ;
    
    Student (String n , int i , double cr)
    {
        name = n ; 
        id = i ;
        credit = cr ;
    }
    
    void addCourse (String c)
    {
        course.add(c) ;
    }
    
    void display ()
    {
        System.out.println(System.lineSeparator() + "Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Credit : "+credit) ;
        System.out.println("Courses : "+course);
    }
}