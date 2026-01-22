import java.util.ArrayList;
class Book{
    private String title;
    private String author;
    Book(String a,String b){
        this.title=a;
        this.author=b;
    }
    void displayDetails(){
        System.out.println("Title"+title+"Author "+author);
    }
}
class Library{
    private String libraryname;
    private ArrayList<Book>books;
    Library(String libraryname){
        this.libraryname=libraryname;
        books=new ArrayList<>();
    }
    void addBook(Book a){
    books.add(a);
    }
    void displayBooks() {
        System.out.println("Library Name: " + libraryname);
        for (Book book : books) {
            book.displayDetails();
        }
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Book b1=new Book("Do epic Shit ","Ankur Warikoo");
        Book b2=new Book(" Java Basics "," Jack ");

        Library library1 = new Library("City Library");
        Library library2 = new Library("College Library");

        library1.addBook(b1);
        library2.addBook(b2);
        library1.displayBooks();
        library2.displayBooks();
    }
}