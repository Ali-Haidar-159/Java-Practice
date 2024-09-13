
package basic2 ;

class Book 
{
    private String name ;
    private Author author ;
    private double price ;
    private int quantity ; 
    
    Book (String name , Author author , double price , int quantity)
    {
        this.name = name ;
        this.author = author ;
        this.price = price ;
        this.quantity = quantity ;
    }
    
    public String getName ()
    {
        return name ;
    }
    
    public Author getAuthor ()
    {
        return author ;
    }
    
    public double getPrice ()
    {
        return price ;
    }
    
    public int getQuantity ()
    {
        return quantity ;
    }
    
    public String toString ()
    {
        return "Book name : "+name + "\tAuthor By : "+author.toString() ; // author mane author class er 
                                                             // toString method k call dichi .
    }
}