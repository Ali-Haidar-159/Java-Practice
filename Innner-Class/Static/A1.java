
package Static ;

class Ali
{
    String name ;
    int id ;
    static int counter=0 ;
    
    static class Haidar 
    {
        //counter 
        
        String firstName ;
        int roll ;
        
        Haidar(String firstName , int roll)
        {
            this.firstName = firstName ;
            this.roll = roll ;
            counter++ ;
        }
        
        void dis()
        {
            System.out.println("\t\tPerson : "+counter);
            System.out.println("Name : "+firstName);
            System.out.println("Roll : "+roll+System.lineSeparator());
        }
    }
}