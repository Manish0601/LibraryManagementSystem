import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while(true) {

            System.out.println("\n1 Add Book");
            System.out.println("2 Show Books");
            System.out.println("3 Issue Book");
            System.out.println("4 Return Book");
            System.out.println("5 Exit");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    library.addBook(new Book(id,title,author));
                    break;

                case 2:
                    library.showBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    library.issueBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    library.returnBook(sc.nextInt());
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}