package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_Books 
{

    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);

        String title, author;
        int isbn, i, n, action;

        ArrayList<Books> m = new ArrayList<Books>();

        for (i = 0; i < m.size(); i++) 
        {
            m.get(i).display();
        }

        for (;;) 
        {
            System.out.println("\n1.Add books \n2.Delete books \n3.Show books \n4.Exit");

            System.out.print("What do you want : ");
            action = x.nextInt();

            if (action == 1) {
                System.out.print("How many book : ");
                n = x.nextInt();

                for (i = 0; i < n; i++) 
                {
                    System.out.print("Enter the book tittle : ");
                    title = x.next();
                    System.out.print("Enter the author name : ");
                    author = x.next();
                    System.out.print("Enter the ISBN number : ");
                    isbn = x.nextInt();

                    Books p = new Books(title, author, isbn);

                    m.add(p);
                }
            } 
            else if (action == 2) 
            {
                System.out.print("Enter the isbn number : ");
                isbn = x.nextInt();

                for (i = 0; i < m.size(); i++) 
                {
                    if (m.get(i).isbn == isbn) 
                    {
                        m.remove(i);
                    }
                }
            }
            else if (action == 3)
            {
                System.out.println("\n\nAfter action : ");

                for (i = 0; i < m.size(); i++) {
                    m.get(i).display();
                }
            } 
            else
            {
                break;
            }
        }
    }
}
