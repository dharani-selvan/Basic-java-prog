
public class lar2 {
    public static void main(String[] args) {
        int a[]={8,1,6,3};
        int max=0,max2=0;
        for(int i=0;i<a.length;i++)
        {      
            if(a[i]>max)
            {
                max2=max;
                max=a[i];
            }
            else if(max>a[i] && max2<a[i])
            {
                max2=a[i];
            }
            
        }
        System.out.println(max2);
    }

    
}