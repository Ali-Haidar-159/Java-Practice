
package Basic ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class TestStudent 
{
    public static void main (String [] args) throws IOException
    {
        LinkedList <Student> std = new LinkedList <Student> () ;
        
        Scanner x = new Scanner (System.in) ;
        InputStreamReader input = new InputStreamReader(System.in) ;
        BufferedReader xx = new BufferedReader(input) ;
        
        int numberOfStudent , i , id ;
        String name ; 
        double gpa ;
        
        
        System.out.print("Enter how many student : ");
        numberOfStudent = x.nextInt() ;
        
        for (i=0 ; i<numberOfStudent ; i++)
        {
            System.out.format("\nEnter %d student name : ",(i+1)) ;
            name = xx.readLine() ;
            System.out.format("Enter %d student id : ",(i+1));
            id = x.nextInt() ;
            System.out.format("Enter %d student gpa : ",(i+1)) ;
            gpa = x.nextDouble() ;
            
            Student packet = new Student(name, id, gpa) ;
            
            std.add(packet) ;
        }
        
        System.out.println("The list is given below : ");
        
        for (Student v : std)
        {
            v.display();
        }
    }
}