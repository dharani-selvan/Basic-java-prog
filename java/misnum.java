public class misnum {
    public static void main(String[] args) {
        int n=5;
        int a[]={1,2,3,5};
        int sum1=0,sum2=0;
        for(int i=0;i<a.length;i++)
        {
            sum1+=a[i];
        }
        sum2=(n*(n+1))/2;
        System.out.println(sum2-sum1);
    }
}
