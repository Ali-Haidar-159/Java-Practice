package basic;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

    public static void main(String[] args) 
    {
        int[] a = new int[6];
        int n, i, j;

        Scanner x = new Scanner(System.in);

        for (i = 0; i < a.length; i++) 
        {
            System.out.print("Enter a[" + i + "] = ");
            a[i] = x.nextInt();
        }

        System.out.println(Arrays.toString(a));

        System.out.print("Enter a number : ");
        n = x.nextInt();

        for (i = 0; i < a.length; i++) 
        {
            if (a[i] == n) 
            {
                for (j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }
            }                 
        }
        
        for (i = 0; i < a.length - 1; i++) 
        {
                System.out.print(" " + a[i]);
        }

    }
}
