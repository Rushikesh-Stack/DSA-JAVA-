class Solution {
    public int findPeakElement(int[] a) 
    {
        int n = a.length;
        int ans = -1;
        int cnt = 0;
        int max = a[0];

        if(n == 1)
        {
            return 0;
        }

        for(int i = 1; i < n - 1; i++)
        {
            if(a[i - 1] < a[i] && a[i] > a[i + 1])
            {
                ans = i;
                cnt++;
                break;
            }
        }

        int idx = 0;

        if(cnt == 0)
        {
            for(int i = 1; i < n; i++)
            {
                if(a[i] > max)
                {
                    max = a[i];
                    idx = i;
                }
            }

            return idx;
        }

        return ans;
    }
}