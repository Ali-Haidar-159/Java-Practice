
package basic ;

public class Test_Static
{
    public static void main (String [] args)
    {
        Static p1 = new Static ("Kamal",11) ;
        p1.displays();
        
        Static.college = "Govt college";
        System.out.println("This is static variable : "+Static.college);
        
    }
}