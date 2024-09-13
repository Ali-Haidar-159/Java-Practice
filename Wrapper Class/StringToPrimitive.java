
package basic ;

public class StringToPrimitive 
{
    public static void main (String [] args)
    {
        String s = "99" ;
        int a = Integer.parseInt(s) ;
        
        System.out.println("String s : "+s);
        System.out.println("int a : "+a);
        
        String s2 = "56.879" ;
        double d = Double.parseDouble(s2) ;
        
        System.out.println("String s2 : "+s2);
        System.out.println("double d : "+d);
        
        String s3 = "true" ;
        boolean b = Boolean.parseBoolean(s3) ;
        
        System.out.println("String s3 : "+s3);
        System.out.println("boolean b : "+b);
    }
}