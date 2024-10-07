public class binarysearch {
    public static void main(String[] args) {
        int a[]={1,3,7,9,16,17,19,22};
        int x=16;
        System.out.println(search(a,x));
    }

    public static int search(int[] a, int x) {
        int left=0;
        int right=a.length-1;
        int mid=0;
        while(left<right)
        {
            mid=(left+right)/2;
            if(a[mid]==x)
            {
                return mid+1;
            }
            else if(a[mid]>x)
            {
                right=mid+1;
            }
            else if(a[mid]<x)
            {
               left=mid-1;
            }
            else
            {
                return -1;
            }
        }
        return -1;
    }
}
