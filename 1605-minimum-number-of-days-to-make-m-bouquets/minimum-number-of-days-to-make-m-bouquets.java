class Solution {
    public int minDays(int[] bloomDay, int m, int k) 
    {
        int n = bloomDay.length;

        // Find the maximum number of days any flower takes to bloom
        int max = 0;

        for(int i : bloomDay)
        {
            max = Math.max(i, max);
        }

        int low=0;
        int high=max;
        int ans=-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int flower=0;
            int bonquet=0;

            for(int i=0;i<n;i++)
            {
                if(bloomDay[i]<=mid)
                {
                    flower++;

                    if(flower==k)
                    {
                        bonquet++;

                        flower=0;
                    }
                }
                else{
                    flower=0;
                }
            }

            if(bonquet>=m)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }

        // Impossible to make m bouquets
        return ans;
    }
}