class Book{
    String title;
    int publicationYear;
    Book(String a,int b){
        this.title=a;
        this.publicationYear=b;
    }
    void displayInfo(){
        System.out.println("Title "+title);
        System.out.println("Publication year "+publicationYear);
    }
}
class Author extends Book{
    String name;
    String bio;
    Author(String a,int b,String c,String d){
        super(a,b);
        this.name=c;
        this.bio=d;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Name "+name);
        System.out.println("Bio "+bio);
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Book l1=new Author("JAVA", 2001, "Jack","JAVA basics in detail" );
        l1.displayInfo();
    }
}
