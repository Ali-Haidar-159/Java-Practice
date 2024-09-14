package lab;

import java.util.Scanner;

public class Fruit {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        double price, weight;

        System.out.print("Enter price : ");
        price = x.nextDouble();
        System.out.print("Enter weight : ");
        weight = x.nextDouble();

        try {
            if (price < 50) {
                throw new FruitException("Available Fruit .");
            } else if (price > 500) {
                throw new FruitException("Rare Fruit");
            } else {
                System.out.println("Price is : " + price * weight);
            }
        } catch (FruitException e) {
            System.out.println("Exception is : " + e);
        }
    }
}
