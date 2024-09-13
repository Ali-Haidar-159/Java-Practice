
package basic ;

class CompileTIme 
{
    String name ;
    int roll ;
    
    void add (int n)
    {
        System.out.format("This is one parameterized method\n") ;
        System.out.println("n+n :"+(n+n));
    }
    
    void add (int n1 , int n2)
    {
        System.out.println("This is two parameterized method");
        System.out.println("n1+n2 : "+(n1+n2));
    }
}