class Solution {
    public int[] runningSum(int[] a) 
    {
        int n=a.length;
        int sum;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=0;j<=i;j++)
            {
                sum=sum+a[j];
                arr[j]=sum;
            }
             
        }

        return arr;
    }
}