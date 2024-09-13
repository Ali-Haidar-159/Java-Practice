package basic;

public class StaticBlock {

    static {

        System.out.println("CSE");
    }

    public static void main (String [] args)
    {
        System.out.println("Hello World...");
    }
}
