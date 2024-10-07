public class rev {
    public static void main(String[] args) {
        String s="hello";
        for(int i=s.length()-1;i>=0;i--)
        {
            System.err.print(s.charAt(i));
        }
        System.out.println();

        int a[]={1,2,3,4,5};
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }
        
    }
}
