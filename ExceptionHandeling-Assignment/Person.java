package lab;

import java.util.Scanner;

public class Person {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int[] age = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age : ");
            age[i] = x.nextInt();
        }

        try {
            int a = age[1] / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception is : " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception is : " + e);
        } catch (NumberFormatException e) {
            System.out.println(("Exception is : " + e));
        } catch (NullPointerException e) {
            System.out.println(("Exception is : " + e));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(("Exception is : " + e));
        } finally {
            System.out.println("This is Finally block .");
        }

    }
}
