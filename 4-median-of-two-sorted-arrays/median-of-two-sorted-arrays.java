class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int n=nums1.length;
        int m=nums2.length;

        int a3[]=new int[n+m];
        int i=0, j=0, k=0;

        while(i<n && j<m)
        {
            if(nums1[i]<=nums2[j])
            {
                a3[k]=nums1[i];
                i++;
            }
            else{
                a3[k]=nums2[j];
                j++;
            }
            k++;
        }

        while(i<n)
        {
            a3[k]=nums1[i];
            i++;
            k++;
        }

        while(j<m)
        {
            a3[k]=nums2[j];
            j++;
            k++;
        }

        int med=0;
        double ans=-1;

        if(k%2!=0)
        {
            med=k/2;
            ans=a3[med];
        }
        else{
            med=k/2;
            int idx=med-1;

             ans=(a3[idx]+a3[med])/2.0;
        }

        return ans;
    }
}