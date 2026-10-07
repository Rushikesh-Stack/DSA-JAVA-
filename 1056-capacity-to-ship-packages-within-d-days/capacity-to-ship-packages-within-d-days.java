class Solution {
    public int shipWithinDays(int[] weights, int days) 
    {
        int n=weights.length;
        int max=0;
        int sum=0;
        int day=1;
        int totalWeight=0;
        int ans=-1;

        // Calculate total weight and find maximum package weight
        for(int i: weights)
        {
            totalWeight=totalWeight+i;
            max=Math.max(i,max);
        }

       int low=max;
       int high=totalWeight;

       while(low<=high)
       {
        int mid=low+(high-low)/2;
        day=1;
        sum=0;

        for(int i=0;i<n;i++)
        {
            sum=sum+weights[i];

            if(sum>mid)
            {
                day++;
                sum=weights[i];
            }
        }

        if(day<=days)
        {
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }

       }

        return ans;
    }
}