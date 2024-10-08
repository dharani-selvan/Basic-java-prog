public class prime {
    public static void main(String[] args) {
        int n=7;
        if(pri(n))
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
        val(n);
    }

    public static void val(int n) {
       System.out.print("prime numbers are:");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
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
