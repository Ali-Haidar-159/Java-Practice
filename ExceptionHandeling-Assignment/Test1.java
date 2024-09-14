package lab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int n1, n2;

        try {
            System.out.print("Enter 1st number : ");
            n1 = x.nextInt();
            System.out.print("Enter 2nd number : ");
            n2 = x.nextInt();

            Calculator obj1 = new Calculator(n1, n2);
            System.out.println(obj1.add());

            System.out.print("Enter 1st number : ");
            n1 = x.nextInt();
            System.out.print("Enter 2nd number : ");
            n2 = x.nextInt();

            Calculator obj2 = new Calculator(n1, n2);
            System.out.println(obj2.subtraction());

            System.out.print("Enter 1st number : ");
            n1 = x.nextInt();
            System.out.print("Enter 2nd number : ");
            n2 = x.nextInt();

            Calculator obj3 = new Calculator(n1, n2);
            System.out.println(obj3.multiolication());

            System.out.print("Enter 1st number : ");
            n1 = x.nextInt();
            System.out.print("Enter 2nd number : ");
            n2 = x.nextInt();

            Calculator obj4 = new Calculator(n1, n2);
            System.out.println(obj4.division());

        } catch (InputMismatchException e) {
            throw new NumberFormatException();
        } catch (ArithmeticException e) {
            System.out.println("Exception is : " + e);
        } catch (NumberFormatException e) {
            System.out.println("The exception is : " + e);
        }
    }
}
