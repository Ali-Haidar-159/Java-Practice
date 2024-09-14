package lab;

public class Problem5 {

    public static void main(String[] args) {
        int arr[] = new int[3];
        String name = "Ali";

        try {
            int a = arr[1] / 0;
        } catch (ArithmeticException e) {
            System.out.println("Invalid Division");
        }

        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }

        try {
            int a = Integer.parseInt(name);
        } catch (NumberFormatException e) {
            System.out.println("Formate mismatch");
        }

        try {
            System.out.println(name.charAt(5));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        }

        try {
            throw new MyException(5);
        } catch (MyException e) {
            System.out.println(e);
        } finally {
            System.out.println("Exception Handling Completed");
        }

    }
}

class MyException extends Exception {

    private int param;

    public MyException(int param) {
        this.param = param;
    }

    @Override
    public String toString() {
        return "MyException[" + param + "]";
    }
}
