import java.util.*;
public class Quef {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<Integer>(); //Collections.reverseOrder() --- desc order
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.peek());
        q.poll();

    }
}
