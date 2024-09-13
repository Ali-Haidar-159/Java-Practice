
package problems ;

public class Test_TraficLight 
{
    public static void main (String [] args)
    {
        TraficLight tl = new TraficLight() ;
        
        System.out.println("The colour is red : "+tl.checkColour());
        tl.setColour("Green");
        System.out.println("The colour is red : "+tl.checkColour());
        
        System.out.println("Duration is : "+tl.duration);
        
        tl.setDuration(100);
        
        System.out.println ("After changing the durataion : "+tl.duration) ;
    }
}