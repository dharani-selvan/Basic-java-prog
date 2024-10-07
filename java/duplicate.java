import java.util.HashMap;

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
    }
}
