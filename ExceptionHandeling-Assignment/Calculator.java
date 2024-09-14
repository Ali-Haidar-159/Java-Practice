package lab;

public class Calculator {

    private double n1;
    private double n2;

    public Calculator(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public double add() {
        double sum = n1 + n2;
        if (sum <= 0) {
            throw new ArithmeticException(" Negative Number .");
        } else {
            return sum;
        }

    }

    public double subtraction() {
        double sub = n1 - n2;

        if (sub <= 0) {
            throw new ArithmeticException(" Negative Number .");
        } else {
            return sub;
        }
    }

    public double multiolication() {
        double multi = n1 * n2;

        if (n1 == 0 || n2 == 0) {
            throw new ArithmeticException("The number is Zero .");
        } else {
            return multi;
        }
    }

    public double division() {
        double div = n1 / n2;

        if (n1 == 0 || n2 == 0) {
            throw new ArithmeticException("The number is Zero .");
        } else {
            return div;
        }
    }

}
