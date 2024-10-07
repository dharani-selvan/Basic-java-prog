

public class Median {
    public static void main(String[] args) {
    
        int a[]={1,2,3,4,5,6};
        int s=a.length;
        if(s%2==1)
        {
            int x=a[s/2];
            System.out.println(x);
        }
        else
        {
            int x=s/2;
            System.out.print( (a[x]+a[x-1])/2);
        }
    }
    
    }


