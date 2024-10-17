import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,1,2,8};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for (int i : map.keySet()) {
            if(map.get(i)>=2)
            {
                System.out.print(i+" ");
            }
        }

        System.out.println();
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.print(a[i]+" ");
                }
            }
        }
        System.out.println();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            if(!set.add(a[i]))
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
