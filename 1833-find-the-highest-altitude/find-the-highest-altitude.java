class Solution {
    public int largestAltitude(int[] a) 
    {
        int n=a.length;
        int point[]=new int[n+1];
        int sum=0;
        int max=0;
        point[0]=0;
        for(int i=0;i<n;i++)
        {
            sum=a[i]+point[i];
            point[i+1]=sum;

            max=Math.max(max,point[i+1]);
        }

        return max;

    }
}