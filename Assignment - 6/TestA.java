
package lab_6 ;

public class TestA {
    public static void main(String[] args) {
        Book book1 = new Book("1234", "Math", 200);
        Book book2 = new Book("9876", "English", 250);

        int totalBooks = Book.getCount();
        System.out.println("Total number of books created: " + totalBooks);
        
    }
}
