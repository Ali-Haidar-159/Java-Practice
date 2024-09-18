
package Basic ;

import java.util.Iterator;
import java.util.Scanner ;
import java.util.LinkedList;

public class TestLinkedList
{
    public static void main (String [] args)
    {
        Scanner x = new Scanner (System.in) ;
        
        String element ;
        int numberOfInput ;
        
        LinkedList <String> ll = new LinkedList<String>() ;
        
        System.out.print("How many number you want to input : ");
        numberOfInput = x.nextInt() ;
        
        int i=0 ;
        do
        {
            System.out.print("Enter the element of this LinkedList : ");
            element = x.next() ;
            
            ll.add(element) ;
            
            i++ ;
        }while(i<numberOfInput) ;
        
//        System.out.println("The LinkedList is : "+ll);

        Iterator ite = ll.iterator() ;
        
        while (ite.hasNext())
        {
            System.out.print(ite.next()+" ,");
        }
        
    }
}