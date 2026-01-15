public class Student {
    String name;
    int rollNumber;
    int marks;
    char Grade(){
        if(marks>=90){
            return 'A';
        }
        else if(marks>=80 && marks<90){
            return 'B';
        }
        else if(marks>=65 && marks<80){
            return 'C';
        }
        else if(marks>=50 && marks<65){
            return 'D';
        }
        else{
            return 'F';
        }
    }
    void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("Roll no:"+rollNumber);
        System.out.println("Marks:"+marks);
    }
    public static void main(String[] args) {
        Student st=new Student();
        st.name="Amit";
        st.rollNumber=12;
        st.marks=84;
        st.displayDetails();
    }
}