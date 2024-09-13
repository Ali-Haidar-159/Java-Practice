package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_Student {

    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);

        String name, course;
        int id, i , j , n, m , action , index=0 ;
        double crdt;
        
        ArrayList <Student> list = new ArrayList <Student> () ;
        
        for (;;)
        {
            System.out.println("\n1.Add Student \n2.Remove Student \n3.Show Students ");
            System.out.println("4.Add Course \n5.Remove Course \n6.Exit");
            
            System.out.print("\nEnter action : ");
            action = x.nextInt() ;
            
            switch (action)
            {
                case 1 : 
                    System.out.print("Enter name : ");
                    name = x.next( );
                    System.out.print("Enter id : ");
                    id = x.nextInt() ;
                    System.out.print("Enter credit : ");
                    crdt = x.nextDouble() ;
                    System.out.print("How many course you want to add : ");
                    n = x.nextInt() ;
                    
                    Student pack = new Student (name , id , crdt) ;
                    list.add(pack) ;
                    
                    for (i=0 ; i<n ; i++)
                    {
                        System.out.print("Enter course name : ");
                        course = x.next() ;
                        list.get(index).addCourse(course);
                    }
                    
                    index++ ;
                    break ;
                
                case 2 :
                    System.out.print("Enter id : ");
                    id = x.nextInt() ;
                    
                    for (i=0 ; i<list.size() ; i++)
                    {
                        if (list.get(i).id == id)
                            list.remove(i) ;
                    }
                    
                    break ; 
                    
                case 3 : 
                    for (Student v : list)
                    {
                        v.display();
                    }
                    break ;
                    
                case 4 :
                    System.out.print("Enter Id : ");
                    id = x.nextInt() ;
                    System.out.print("How many course you want to add : ");
                    n = x.nextInt () ;
                    
                    for (i=0 ; i<list.size() ; i++)
                    {                        
                        if (list.get(i).id == id)
                        {
                            for (j=0 ; j<n ; j++)
                            {
                                System.out.print("Enter course name : ");
                                course = x.next() ;
                                list.get(i).addCourse(course);
                            }
                        }
                           
                    }
                    break ;
                    
                case 5 :
                    System.out.print("Enter id : ") ;
                    id = x.nextInt() ;
                    
                    for (i=0 ; i<list.size() ; i++)
                    {
                        if (list.get(i).id == id)
                        {
                            System.out.println(list.get(i).course);
                            System.out.print("Which course : ");
                            m = x.nextInt() ;
                            list.get(i).course.remove(m-1) ;
                            System.out.println("--- DELETED ---");
                        }
                    }
                    break ;
                    
            }
            
            if (action == 6)
                break ;            
        }
        
    }
}
