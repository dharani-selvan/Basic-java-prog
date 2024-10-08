public class a1b2c3 {
    public static void main(String[] args) {
        String s="a1b2c3";
        for(int i=0;i<s.length();i+=2)
        {
            char x=s.charAt(i);
            int z= s.charAt(i+1)-48;
            for(int j=0;j<z;j++)
            {
                System.out.print(x);
            }
        }
    }
}
