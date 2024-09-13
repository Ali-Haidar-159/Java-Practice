package basic;

public class PrimitiveToString {

    public static void main(String[] args) 
    {
        int a = 100;
        String s = Integer.toString(a);

        System.out.println("Int a : " + a);
        System.out.println("String s : " + s);
        
        double d = 5.644 ;
        String s2  = Double.toString(d) ;
        
        System.out.println("double d : "+d);
        System.out.println("String s2 : "+s2);
        
        boolean b = true ;
        String s3 = Boolean.toString(b) ;
        
        System.out.println("boolean b : "+b);
        System.out.println("String s2 : "+s3);
    }
}
