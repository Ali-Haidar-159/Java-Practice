package lab_6;

public class Book {

    private String ISBN;
    private String bookTitle;
    int numberOfPages;
    private static int count = 0;

    public Book(String ISBN, String bookTitle, int numberOfPages) {
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
        count++;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public static int getCount() {
        return count;
    }
}
