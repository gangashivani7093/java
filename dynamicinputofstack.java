import java.util.*;
public class dynamicinputofstack{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        System.out.println(s.peek());
        System.out.println(s.pop());
    }
}