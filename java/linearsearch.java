public class linearsearch {
    public static void main(String[] args) {
        int a[]={1,3,7,9,16,17,19,22};
        int x=16;
        System.out.println(search(a,x));
    }

    public static int search(int[] a, int x) {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==x)
            {
                return i+1;
            }
        }
        return -1;
        
    }
}
