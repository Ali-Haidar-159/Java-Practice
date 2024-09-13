
package basic ;

class Static 
{
    String name ;
    int id ;
    static String college  ;
    
    Static (String name , int id)
    {
        this.name = name ;
        this.id = id ;
    }
    
    void displays  ()
    {
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("College : "+college);
    }
}