import java.util.HashSet;

public class Uninter{
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int a1[]={1,2,3,4,5,6,7,9};
        int a2[]={1,2,3,6,5};
        System.out.println("intersect");
        inter(a1, a2);
        System.out.println("");
        System.out.println("union");
        union(a1,a2);
        System.out.println("");
        System.out.println("execpt");
        execpt(a1,a2);
        
    }
    public static void execpt(int[] a1, int[] a2) {
        for(int i=0;i<a1.length;i++)
        {
            boolean flag=true;
            for(int j=0;j<a2.length;j++)
            {
                if(a1[i]==a2[j])
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                System.out.print(a1[i]+" ");
            }
        }
    }
    public static void union(int[] a1, int[] a2) {
       HashSet<Integer> set=new HashSet<>();
       for (int i : a1) {
            set.add(i);
       }
       for (int i: a2){
        set.add(i);
       }
       for (int i : set) {
         System.out.print(i+" ");
       }

        
        
    }
    public static void inter(int a1[],int a2[])
    {
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a2.length;j++)
            {
            
            if (a1[i]==a2[j]) {
                System.out.print(a1[i]+" ");
            }
        }
        }
    }
}