class Solution {
    public int[] runningSum(int[] a) 
    {
        int n=a.length;
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            a[i]=sum;
             
        }

        return a;
    }
}