import java.util.*;
public class Base {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int b=sc.nextInt();
        int rem;
        ArrayList<Integer> a=new ArrayList<>();
        while(num!=0)
        {
            rem=num%b;
            num/=b;
            a.add(rem);
        }
        char ch='A';
        for(int i=a.size()-1;i>=0;i--)
        {
            if(a.get(i)<10)
            {
            System.out.print(a.get(i));
            }
            else
            {
                int x=a.get(i)%10;   
                System.out.printf("%c",ch+x);
            }
        }
        sc.close();
    }
    
}