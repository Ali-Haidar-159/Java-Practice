package basic;

import java.util.Arrays;

public class SeparateEvenNumbers {

    public static void main(String[] args) {
        int[] a = {5, 2, 6, 7, 9, 2, 1};
        int i, temp;

        System.out.println("Before separate : " + Arrays.toString(a));

        for (int j = 0; j < a.length; j++) {
            for (i = 0; i < a.length - 1; i++) {
                if (a[i] % 2 != 0) {
                    temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
            }
        }

        System.out.format("After separate : ");
        for (int v : a) {
            System.out.print(" " + v);
        }

    }
}
