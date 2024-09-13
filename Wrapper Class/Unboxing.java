
package basic ;

public class Unboxing 
{
    public static void main (String [] args)
    {
        Integer I = new Integer (10) ;
        Float F = new Float (10.4)  ;
        Double D = new Double (10.4) ;
        Character C = new Character ('z');
        Boolean B = new Boolean (true) ;
        
        System.out.println("Integer  I : "+I) ;
        System.out.println("Float F : "+F); 
        System.out.println("Double D : "+D);
        System.out.println("Character C : "+C);
        System.out.println("Boolean B : "+B + System.lineSeparator());
        
        int i = I.intValue() ;
        float f = F.floatValue() ;
        double d = D.doubleValue() ; 
        char c = C.charValue() ;
        boolean b = B.booleanValue() ;
        
        
        System.out.println("int i = "+i);
        System.out.println("float f = "+f);
        System.out.println("double d = "+d);
        System.out.println("char c = "+c);
        System.out.println("boolean b = "+b+System.lineSeparator());
    }
}