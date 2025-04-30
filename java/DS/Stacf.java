import java.util.*;
public class Stacf {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.pop();
        s.pop();
        System.out.println("peek:"+s.peek());
        s.add(5);
        System.out.println("get:"+s.get(1));
        while (!s.empty()) {
            System.out.println(s.pop());
        }
    }
}
