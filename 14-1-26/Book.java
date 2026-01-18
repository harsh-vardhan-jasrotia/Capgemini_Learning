
public class Book {
   
    static String libraryName = "City Central Library";

   
    String title;
    String author;
    final String isbn;  

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayDetails(Object obj) {
        if (obj instanceof Book) {
            Book b = (Book) obj;
            System.out.println("Title: " + b.title);
            System.out.println("Author: " + b.author);
            System.out.println("ISBN: " + b.isbn);
        } else {
            System.out.println("Object is not a Book");
        }
    }
}
