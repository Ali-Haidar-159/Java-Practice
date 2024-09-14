package lab_6;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int x1, x2, y1, y2;

        Line arr[] = new Line[4];

        Scanner x = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter x1 , y1 , x2 , y2 : ");
            x1 = x.nextInt();
            y1 = x.nextInt();
            x2 = x.nextInt();
            y2 = x.nextInt();

            arr[i] = new Line(x1, y1, x2, y2);
        }

        for (int i = 0; i < 4; i++) {
            arr[i].findSlop();
        }

    }
}
