class Solution {
    public int mostFrequentEven(int[] a) 
    {
        int n=a.length;
        int cnt=0;
        int maxcnt=0;
        int ans=-1;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j] && a[j] %2==0)
                {
                    cnt++;
                }
            }

            if(maxcnt<cnt)
            {
                ans=a[i]; //store previous element
                maxcnt=Math.max(maxcnt,cnt);
            }
            else if(maxcnt==cnt)
            {
                //compare prevoius element with current element
                if(a[i]<ans) //curr<previous
                {
                    ans=a[i]; //store smallest element
                }
            }

            cnt=0;
            
        }

        return ans;
    }
}