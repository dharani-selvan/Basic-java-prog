public class fibo {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fiboo(n));
    }

    public static int fiboo(int n) {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return  n+fiboo(n-1);
    }
}
