package lab;

import java.util.Scanner;

public class Person2 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int[] age = new int[3];
        String s = null;
        String s2 = "Ali";

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age : ");
            age[i] = x.nextInt();
        }

        try {
            try {
                int a = age[1] / 0;
            } catch (ArithmeticException e) {
                System.out.println("Exception is : " + e);
            }

            try {
                System.out.println(age[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception is : " + e);
            }

            try {
                System.out.println(s.charAt(1));
            } catch (NullPointerException e) {
                System.out.println(("Exception is : " + e));
            }

            try {
                System.out.println(s2.charAt(3));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println(("Exception is : " + e));
            }

        } catch (Exception e) {
            System.out.println(("Exception is : " + e));
        } finally {
            System.out.println("This is Finally block .");
        }

    }
}
