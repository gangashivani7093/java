import java.util.Queue;
import java.util.LinkedList;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        System.out.println(q);         // [1, 2]
        System.out.println(q.remove()); // 1
        System.out.println(q);         // [2]
    }
}
