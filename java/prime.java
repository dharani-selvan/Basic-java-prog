public class prime {
    public static void main(String[] args) {
        int n=7;
        System.out.println(pri(n));
    }

    public static boolean pri(int n) {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
