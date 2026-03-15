import java.util.ArrayList;

class Library {

    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void showBooks() {
        for(Book b : books) {
            b.display();
        }
    }

    void issueBook(int id) {
        for(Book b : books) {
            if(b.getId() == id && !b.isIssued()) {
                b.issueBook();
                System.out.println("Book Issued");
                return;
            }
        }
        System.out.println("Book not available");
    }

    void returnBook(int id) {
        for(Book b : books) {
            if(b.getId() == id && b.isIssued()) {
                b.returnBook();
                System.out.println("Book Returned");
                return;
            }
        }
        System.out.println("Invalid Book ID");
    }
}
