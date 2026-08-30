class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int n=grid.length;
        int cnt;
        int repeating=-1;
        int missing=-1;

        for(int num=1;num<=n*n;num++)
        {
            cnt=0;// reset cnt for new element i

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(grid[i][j]==num)
                    {
                        cnt++;
                    }
                }
            }

            if(cnt==0)
            {
                missing=num; 
            }
            if(cnt>1)
            {
                 repeating=num;
              
            }
        }

        return new int[]{repeating,missing};
    }
}