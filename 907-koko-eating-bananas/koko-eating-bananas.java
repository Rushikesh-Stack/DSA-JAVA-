class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        int max = 0;

        for(int x : piles)
        {
            max = Math.max(max, x);
        }

        int low = 1;
        int high = max;
        int k = -1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            long hrs = 0;

            for(int i = 0; i < piles.length; i++)
            {
                hrs += (piles[i] + mid - 1) / mid;
            }

            if(hrs <= h)
            {
                k = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return k;
    }
}