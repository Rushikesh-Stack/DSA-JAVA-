class Solution {
    public int minDays(int[] bloomDay, int m, int k) 
    {
        int n = bloomDay.length;

        int max = 0;
        int ans=-1;

        for(int i : bloomDay)
        {
            max = Math.max(i, max);
        }

        int low = 1;
        int high = max;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            int flower = 0;
            int bouquet = 0;

            // Check all flowers for this particular day
            for(int i = 0; i < n; i++)
            {
                if(bloomDay[i] <= mid)
                {
                    flower++;

                    if(flower == k)
                    {
                        bouquet++;
                        flower = 0;
                    }
                }
                else
                {
                    // Sequence is broken
                    flower = 0;
                }
            }

            // Now decide the Binary Search direction
            if(bouquet >= m)
            {
                ans=mid;
                // mid works, try fewer days
                high = mid - 1;
            }
            else
            {
                // mid doesn't work, need more days
                low = mid + 1;
            }
        }

        return ans;
    }
}