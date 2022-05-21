package project;

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Library l = new Library(5);
        try {
            int x;
            do {
                System.out.println("--------------------------");
                System.out.println("       Main Mnue");
                System.out.println("--------------------------");
                System.out.println(" 1-Add Book \n " + "2-Show All Books\n" + " 3-Delete Book \n"
                        + " 4-Search Book \n" + " 5-Sort Books \n" + " 5-Exit ");
                System.out.println("--------------------------");
                System.out.print("Enter a Num: ");

                x = in.nextInt();
                switch (x) {
                    case (1):
                        System.out.print("Enter Book Name: ");
                        String name = in.next();
                        System.out.print("Enter Book Number: ");
                        int num = in.nextInt();
                        l.push(name, num);
                        break;
                    case (2):
                        System.out.println("Your Book Stack: ");
                        l.print();
                        break;
                    case (3):
                        l.pop();
                        System.out.println("Book Deleted");
                        break;
                    case (4):
                        System.out.print("Search an Book: ");
                        String book = in.next();
                        l.search(book);
                        break;
                    case (5):
                        System.out.println("Sorted Stack: "); 
                        l.Sort();
                        l.print();
                        break;
                    case (6):
                        System.out.println("Your Dun");
                        System.exit(0);
                        break;
                }
            } while (x != 0);

        } catch (Exception ex) {
            System.out.println("Enter a Number!!");
        }
    }
}
