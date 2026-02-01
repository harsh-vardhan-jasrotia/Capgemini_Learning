import java.util.*;
public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );
        LinkedList<Integer> reversed = new LinkedList<>();
        while (!list.isEmpty()) {
            reversed.add(list.removeLast());
        }
        System.out.println(reversed);
    }
}
