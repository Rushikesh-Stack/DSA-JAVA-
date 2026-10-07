class Solution {
    public int smallestDivisor(int[] nums, int threshold) 
    {
        int n=nums.length;
        int sum=0;
        double divAns=-1;
        double ans=-1;
        int min=-1;
        int max=0;

        for(int i:nums)
        {
            max=Math.max(max,i);
        }

        int low=1;
        int high=max;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            sum=0;
            for(int i=0;i<n;i++)
            {
                divAns=(double)nums[i]/mid;
                ans=Math.ceil(divAns);

                sum=sum+(int)ans;
            }

            if(sum<=threshold)
            {
                min=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return min;
    }
}