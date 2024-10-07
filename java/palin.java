public class palin {
    public static void main(String[] args) {
        String s="madam";
        boolean flag=true;
        int n=s.length();
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
            {
                flag=false;
            }   
        }
        if(flag)
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }

        int x=101;
        int temp=x,rev=0;
        while(temp!=0)
        {
            int rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        if(x==rev)
        {
            System.out.println("Integer is palindrome");
        }
        else
        {
            System.out.println("Integer is not palindrome");
        }
    }
}
