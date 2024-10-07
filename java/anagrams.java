import java.util.HashMap;

public class anagrams {
    public static void main(String[] args) {
        String s1="eta";
        String s2="ate";
        System.out.println(ana(s1,s2));
        
    }

    public static boolean ana(String s1, String s2) {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            char x=s1.charAt(i);
            map1.put(x,map1.getOrDefault(x, 0)+1);
        }
        for(int i=0;i<s2.length();i++)
        {
            char x=s2.charAt(i);
            map2.put(x,map2.getOrDefault(x, 0)+1);
        }
        if(map1.size()!=map2.size())
        {   
            return false;
        }
        for( char x:map1.keySet())
        {
            if(!map2.containsKey(x)|| map1.get(x)!=map2.get(x))
            {
                return false;
            }
        }
        for(char x:map2.keySet())
        {
            if(!map1.containsKey(x))
            {
                return false; 
            }
        }
        return true;
    }
}
