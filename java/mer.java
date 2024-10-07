import java.util.Arrays;

public class mer {
    public static void main(String[] args) {
        int a1[]={1,3,5,7,9};
        int a2[]={2,4,6,8};
        int m=a1.length;
        int n=a2.length;
        int mer[]=new int[m+n];
        merge(a1,a2,m,n,mer);
        System.out.println(Arrays.toString(mer));
    }
      public static  void merge(int a1[],int a2[],int m,int n,int mer[])
      {
        int i=0,j=0,k=0;
        while(i<m && j<n)
        {
            if(a1[i]<=a2[j])
            {
                mer[k++]=a1[i++];
            }
            else
            {
                mer[k++]=a2[j++];
            }
        }
        while (i<m) {
            mer[k++]=a1[i++];
        }
        while (j<n) {
            mer[k++]=a2[j++];
        }        
        // for(int i=0;i<m;i++)
        // {
        //     mer[i]=a1[i];
        // }
        // for(int i=0;i<n;i++)
        // {
        //     mer[i+m]=a2[i];
        // }
        // Arrays.sort(mer);
           
           
      }
}