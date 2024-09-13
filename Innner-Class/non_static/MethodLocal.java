
package non_static ;

class Ali2
{    
    void apple (String name , int id)
    {
        class Haidar2
        {
            String name ;
            int id ;
            static int c=0 ;
            
            Haidar2 (String name , int id)
            {
                this.name = name ;
                this.id = id ;
                c++ ;
            }
            
            void dis()
            {
                System.out.println("\t\tPerson : "+c);
                System.out.println("Name : "+name);
                System.out.println("Id : "+id + System.lineSeparator());
            }
        }
        
        Haidar2 obj = new Haidar2(name , id) ;
        obj.dis();
    }
}