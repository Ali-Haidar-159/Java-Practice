package lab_6;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Student[] st = new Student[5];
        Course[] crs = new Course[5];
        Faculty[] fcl = new Faculty[5];

        String name, ctittle, fclty, cid, fname, fposition;
        int id, fid;
        double cgpa, crdt;

        Scanner x = new Scanner(System.in);

        System.out.print("1.Add \n2.Delete  \n3.Update \n4.Print \n5.Search");
        System.out.print("\n\nEnter a number : ");
        int n = x.nextInt();

        switch (n) {
            case 1: {
                System.out.println("1.Add Student \n2.Add Course \n3.Add Faculty ");
                System.out.print("Enter a number : ");
                int nn = x.nextInt();

                if (nn == 1) {
                    System.out.print("How many student you want to add : ");
                    int stn = x.nextInt();
                    for (int i = 0; i < stn; i++) {
                        System.out.print("\nEnter your name : ");
                        name = x.next();
                        System.out.print("Enter your id : ");
                        id = x.nextInt();
                        System.out.print("Enter your cgpa : ");
                        cgpa = x.nextDouble();

                        st[i] = new Student(name, id, cgpa);
                        System.out.println("You Added " + (i + 1) + "Student");
                    }

                    for (int i = 0; i < stn; i++) {
                        st[i].toString();
                    }

                } else if (nn == 2) {
                    System.out.print("How many course you want to add : ");
                    int cad = x.nextInt();

                    for (int i = 0; i < cad; i++) {
                        System.out.print("\nEnter course Id : ");
                        cid = x.next();
                        System.out.print("Enter course tittle : ");
                        ctittle = x.next();
                        System.out.print("Enter course credit : ");
                        crdt = x.nextDouble();
                        System.out.print("Enter your favourite faculty : ");
                        fname = x.next();
                        System.out.print("Enter your faculty id : ");
                        fid = x.nextInt();
                        System.out.print("Enter faculty position : ");
                        fposition = x.next();

                        Faculty f1 = new Faculty(fid, fname, fposition);
                        crs[i] = new Course(cid, ctittle, crdt, f1);

                        System.out.println("You Added  " + (i + 1) + " Course.");

                    }

                    for (int i = 0; i < cad; i++) {
                        crs[i].toString();
                    }
                } else if (nn == 3) {
                    System.out.print("How many faculty you want to add : ");
                    int fn = x.nextInt();

                    for (int i = 0; i < fn; i++) {
                        System.out.print("\nEnter faculty name : ");
                        fname = x.next();
                        System.out.print("Enter faculty ID : ");
                        fid = x.nextInt();
                        System.out.print("Enter the position : ");
                        fposition = x.next();

                        fcl[i] = new Faculty(fid, fname, fposition);
                    }
                    System.out.println("\nSuccessfully Added Faculty .");

                }
                break;

            }

            case 2: {

                System.out.println("1.Remove a student \n2.Delete a course \n3.Remove a faculty");
                System.out.println("Enter a number : ");
                int nn = x.nextInt();

                if (nn == 1) {
                    System.out.print("Enter student Id : ");
                    id = x.nextInt();

                    System.out.print("Enter Name : ");
                    name = x.next();

                    System.out.println("\n\nSuccessfully Removed .");
                } else if (nn == 2) {
                    System.out.print("Enter course Id : ");
                    cid = x.next();

                    System.out.print("Enter tittle : ");
                    ctittle = x.next();

                    System.out.println("\n\nSuccessfully Course Removed .");
                } else if (nn == 3) {
                    System.out.print("Enter faculty Id: ");
                    fid = x.nextInt();

                    System.out.print("Enter faculty Name : ");
                    fname = x.next();

                    System.out.println("\n\nSuccessfully Removed .");
                }
            }
            case 3: {
                System.out.print("Enter old ID : ");
                id = x.nextInt();
                System.out.print("Enter new id : ");
                int id2 = x.nextInt();

                System.out.println("The Student List Is Updated .");
            }
        }
    }
}
