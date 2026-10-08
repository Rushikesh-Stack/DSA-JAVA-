class Solution {
    public int findKthPositive(int[] arr, int k) 
    {
        int n=arr.length;

        int low=0;
        int high=n-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            // Number of missing elements before arr[mid]
            int missing=arr[mid]-(mid+1);

            if(missing<k)
            {
                // Need more missing numbers
                low=mid+1;
            }
            else
            {
                // k-th missing number is on the left
                high=mid-1;
            }
        }

        return low+k;
    }
}