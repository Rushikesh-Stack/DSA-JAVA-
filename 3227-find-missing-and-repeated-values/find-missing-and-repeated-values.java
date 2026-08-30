class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int n=grid.length;
        int cnt;
        int repeating=-1;
        int missing=-1;
        int hash[]=new int[n*n+1];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                hash[grid[i][j]]++;
            }
        }

        for(int i=0;i<=n*n;i++)
        {
            if(hash[i] > 1)
            {
                repeating = i;
            }

            if(hash[i] == 0)
            {
                missing = i;
            }
        }


        return new int[]{repeating,missing};
    }
}