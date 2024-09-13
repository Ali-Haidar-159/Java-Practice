
package basic ;

class Circle implements Shape
{
    //getArea () , nameOfShape() ;
    
    int radious ; 
    
    Circle (int radious)
    {
        this.radious = radious ;
    }
    
    public double getArea () 
    {
        return (Math.PI*radious*radious) ;
    }
    
    public void nameOfShape ()
    {
        System.out.println("This is Circle .");
    }
}