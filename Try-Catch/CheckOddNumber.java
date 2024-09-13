package basic;

import java.util.Scanner;

class CheckOdd extends Exception {

}

public class CheckOddNumber {

    public static void check(int num) {
        try 
        {
            if (num % 2 != 0) 
            {
                throw new CheckOdd();
            } 
            else 
            {
                System.out.println("The number is Even.");
            }
        }
        
        catch (Exception o)
        {
            System.out.println("The error is : "+o);
            System.out.println("Enter a even number .");
        }
        
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int number;

        System.out.format("Enter a number to check : ");
        number = x.nextInt();

        check(number);
    }
}
