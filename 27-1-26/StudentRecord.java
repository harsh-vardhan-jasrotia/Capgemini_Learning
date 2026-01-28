class StudentNode{
    int roll;
    int age;
    String name,grade;
    StudentNode next;
    StudentNode(int roll, String name,int age,String grade){
        this.roll=roll;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.next=null;
    }   
} 
class StudentLinkedList {
    StudentNode head;
    void addAtBeginning(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }
    void addAtEnd(int roll,String name,int age,String grade){
        StudentNode newNode=new StudentNode(roll,name,age,grade);
        if(head==null){
            head=newNode;
            return;
        }
        StudentNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void insertAtPosition(int pos,int roll,String name,int age,String grade){
        if (pos==1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        StudentNode temp = head;
        for (int i = 1;i<pos-1 && temp!=null;i++)
            temp=temp.next;
        if (temp==null) {
            System.out.println("Invalid Position");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    void display() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " | " + temp.name + " | " + temp.age + " | " + temp.grade);
            temp = temp.next;
        }
    }
    void deleteByRoll(int roll) {
        if (head == null) return;

        if (head.roll == roll) {
            head = head.next;
            return;
    }
}
public class StudentRecord {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        list.addAtBeginning(1, "harsh", 20, "A");
        list.addAtEnd(2, "aman", 21, "B");
        list.insertAtPosition(2, 3, "vishal", 22, "A");

        list.display();
    }
}
