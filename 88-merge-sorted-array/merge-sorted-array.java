class Solution {
    public void merge(int[] a1, int m, int[] a2, int n) 
    {
        
        for(int i=0;i<n;i++)
        {
           a1[m+i]=a2[i]; 
        }

        Arrays.sort(a1);
    }
}