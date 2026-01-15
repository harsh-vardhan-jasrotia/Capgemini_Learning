public class Book {
    String title;
    String author;
    double price;
    void displayDetails(){
        System.out.println("Book title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);
    }
    public static void main(String[] args) {
        Book b=new Book();
        b.title="Java Programming";
        b.author="James Gosling";
        b.price=550.00;
        b.displayDetails();
    }
}
