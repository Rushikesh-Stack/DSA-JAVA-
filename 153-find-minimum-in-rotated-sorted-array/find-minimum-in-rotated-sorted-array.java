class Solution {
    public int findMin(int[] a) 
    {
        int n=a.length;
        int low=0;
        int high=n-1;
        int mid;
        int min=999999999;

        while(low<high)
        {
            mid=(high+low)/2;
            if(a[mid]>a[high])
            { 
                low=mid+1;
            }   
            else{
                high=mid;
            }
        }

        return a[low];


    }
}