class Solution {
    public int[] searchRange(int[] a, int target) 
    {
        int n=a.length;
        int low=0;
        int high=n-1;
        int mid;
        int ans1=-1;
        int ans2=-1;

        //For finding first index
        while (low<=high)
        {
            mid=(high+low)/2;

            if(a[mid]>=target)
            {
                ans1=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }

        if(ans1==-1 || a[ans1]!=target)
        {
            return new int[]{-1, -1};
        }

        //Reset values for 2nd loop
        low = 0;
        high = n - 1;

        //For finding last idx
        while (low<=high)
        {
            mid=(high+low)/2;

            if(a[mid]<=target)
            {
                ans2=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }

        return new int[]{ans1, ans2};
    }
}