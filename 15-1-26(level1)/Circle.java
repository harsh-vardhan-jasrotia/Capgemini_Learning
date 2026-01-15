
public class Circle {
    double radius;
    double calculateArea(){
        return 3.14*radius*radius;
    }
    double calulatecircum(){
        return 2*3.14*radius;
    }
    void displayResult(){
        System.out.println("Radius:"+radius);
        System.out.println("Area of circle:"+calculateArea());
        System.out.println("circumference of circle:"+calulatecircum());
    }
    public static void main(String[] args) {
        Circle c=new Circle();
        c.radius=7;
        c.displayResult();


    }
}
