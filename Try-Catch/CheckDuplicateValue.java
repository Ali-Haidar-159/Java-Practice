package basic;

import java.util.ArrayList;

class CheckDuplicate extends Exception {

}

public class CheckDuplicateValue {

    public static void checkDuplicateNumber(ArrayList<Integer> m) 
    {
        try 
        {
            int i , j ;
            
            for (i=0 ; i<m.size() ; i++)
            {
                for (j=i+1 ; j<m.size()-1 ; j++)
                {
                    if (m.get(i) == m.get(j))
                        throw new CheckDuplicate() ;
                }
            }
            System.out.println("There is no duplicate value.");
        }
        
        catch (Exception obj)
        {
            System.out.println("The exception is : "+obj);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(33);
        arr.add(50);
        
        checkDuplicateNumber(arr);

    }
}
