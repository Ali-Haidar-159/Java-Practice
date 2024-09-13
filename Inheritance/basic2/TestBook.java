
package basic2 ;

public class TestBook 
{
    public static void main (String [] args)
    {
        Author a1 = new Author ("Kazi Nazrul Iskam","knazrul@gmail.com",'m');
        Book b1 = new Book ("Pother pachali",a1,250,5) ;
        
       System.out.println(b1);
       
       //System.out.println(b1.getAuthor().getEmail());
       
    }
}