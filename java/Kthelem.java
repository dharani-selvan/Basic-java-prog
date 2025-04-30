import java.util.*;
public class Kthelem {

    public static void main(String[] args) {
        int a[]={1,6,2,8,3,9,10};
        int k=2;
        System.out.println(ele(a,k));
    }

    private static int ele(int[] a, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<a.length;i++)
        {
            p.add(a[i]);
            if(p.size()>k)
            {
                p.poll();
            }
        }
        return p.peek();
    }   
}
