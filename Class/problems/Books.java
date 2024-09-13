
package problems ;

class Books 
{
    String title ;
    String author ; 
    int isbn ;
    
    Books (String t , String a , int i)
    {
       title = t ;
       author = a ;
       isbn = i ;
    }
    
    void display ()
    {
        System.out.println(System.lineSeparator() + "Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("ISBN : "+isbn);
    }
}