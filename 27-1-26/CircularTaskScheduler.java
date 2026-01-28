class TaskNode {
    int taskId, priority;
    String taskName, dueDate;
    TaskNode next;
    TaskNode(int id, String name, int priority, String dueDate) {
        this.taskId = id;
        this.taskName = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
class TaskScheduler {
    TaskNode head = null;
    TaskNode current = null;
    void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }
     void searchByPriority(int p) {
        if (head == null) return;
        TaskNode temp = head;
        boolean found = false;
        do {
            if (temp.priority == p) {
                System.out.println(temp.taskId + " | " + temp.taskName +
                        " | Due: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found)
            System.out.println("No task with given priority");
    }
}
public class CircularTaskScheduler {
    public static void main(String[] args) {
        
    }
}
