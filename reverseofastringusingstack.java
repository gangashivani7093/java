import java.util.Stack;
import java.util.Scanner;

public class reverseofastringusingstack {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
       
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }

        String reversed = "";
        for (int i = 0; i < s.length(); i++) {
            reversed += st.pop();
        }

        System.out.println("Reversed string: " + reversed);        
    }
}
