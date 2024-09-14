
package lab_6 ;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Line2[] lines = new Line2[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter coordinates for Line " + (i + 1));
            System.out.print("x1: ");
            double x1 = scanner.nextDouble();
            System.out.print("y1: ");
            double y1 = scanner.nextDouble();
            System.out.print("x2: ");
            double x2 = scanner.nextDouble();
            System.out.print("y2: ");
            double y2 = scanner.nextDouble();

            lines[i] = new Line2(x1, y1, x2, y2);
        }
        
        for (int i = 0; i < lines.length; i++) {
            for (int j = i + 1; j < lines.length; j++) {
                if (Line2.isIntersecting(lines[i], lines[j])) {
                    System.out.println("Line " + (i + 1) + " and Line " + (j + 1) + " intersect.");
                }
            }
        }
    }
}