
package basic ;

public class AutoBoxing 
{
    public static void main (String [] args)
    {
        int a = 10 ;
        float f = 10.56f ;
        double d = 15.65 ; 
        char c  = 'A' ;
        boolean b = true ;
        
        System.out.println("int a = "+a);
        System.out.println("float f = "+f);
        System.out.println("double d = "+d);
        System.out.println("char c = "+c);
        System.out.println("boolean b = "+b+System.lineSeparator());
        
        Integer A = Integer.valueOf(a) ;
        Float F =Float.valueOf(f) ;
        Double D = Double.valueOf(d) ;
        Character C = Character.valueOf(c) ;
        Boolean B = Boolean.valueOf(b) ;
        
        System.out.println("Integer  A : "+A) ;
        System.out.println("Float F : "+F); 
        System.out.println("Double D : "+D);
        System.out.println("Character C : "+C);
        System.out.println("Boolean B : "+B);
                
    }
}