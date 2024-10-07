public class pangrams {
    public static void main(String[] args) {
        String s="abcdefghijklmnopqrstuvwxyz";
        System.out.println(pan(s)); 
    }

    private static boolean pan(String s) {
        char x='a';
        while(x<'z')
        {
            if(s.indexOf(x)==-1)
            {
                return false;
            }
            x+=1;
        }
        return true;
    }
}
