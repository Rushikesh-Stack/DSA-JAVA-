class Solution {
    public int[] rowAndMaximumOnes(int[][] a) 
    {
        int rows=a.length;
        int cols=a[0].length;

        int cnt;
        int max=0;
        int idx=0;

        for(int i=0;i<rows;i++)
        {
            cnt=0;
            for(int j=0;j<cols;j++)
            {
                if(a[i][j]==1)
                {
                    cnt++;
                }
            }
            if(cnt>max)
            {
                max=cnt;
                idx=i;
            }
        }

        return new int[]{idx,max};

    }
}