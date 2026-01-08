public class NullPointer {
    public static void generateException(){
        String text=null;
        System.out.println(text.length());
    }
    public static void handleException(){
        String text=null;
        try{
            System.out.println(text.length());
        }
        catch(NullPointerException e){
            System.out.println("Null pointer exception caught");
            System.out.println("Attempt to acces null object");
        }
    }
    public static void main(String[] args) {
    System.out.println("Generating exception:");
    try {
        generateException();
    } catch (NullPointerException e) {
        System.out.println("NullPointerException handled in main()");
    }
    System.out.println("Handling exception:");
    handleException();
    }
}
