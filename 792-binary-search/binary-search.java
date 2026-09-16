class Solution {
    public int search(int[] a, int target) 
    {
        int n=a.length;
        int low=0;
        int high=n-1;
        int mid;


        while(low<=high)
        {
            mid=(low + high)/2;

            if(a[mid]==target)
            {
                return mid;
            }
            else if (a[mid]>target)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
         
         return -1;

    }
}