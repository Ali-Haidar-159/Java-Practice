
package basic2 ;

class Author 
{
    private String name ;
    private String email ;
    private char gender ;
    
    Author (String name , String email , char gender)
    {
        this.name = name ;
        this.email = email ;
        
        if (gender == 'm' || gender == 'M')
            this.gender = gender ;
        else if (gender == 'f' || gender == 'F')
            this.gender = gender ;
        else 
            System.out.println("Enter right gender.");
    }
    
    public String getName ()
    {
        return name ;
    }
    
    public String getEmail ()
    {
        return email ;
    }
    
    public char getGender ()
    {
        return gender ;
    }
    
    public String toString  ()
    {
        return "name : "+name+"\nEmail : "+email+"\nGender : "+gender ;
    }
}