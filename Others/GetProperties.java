
package basic ;

public class GetProperties 
{
    public static void main (String [] args)
    {
        System.out.println("Verson : "+System.getProperty("java.version"));
        System.out.println("Home : "+System.getProperty("java.home"));
        System.out.println("Operating System : "+System.getProperty("os.name"));
        System.out.println("Operating System Version : "+System.getProperty("os.version"));
    }
}