class Solution {
    public String reverseStr(String s, int k) 
    {
        int n=s.length();
        int k2=2*k;

        char[] a=s.toCharArray();

        for(int i=0;i<n;i+=k2)
        {
          int low=i;
          int high=Math.min(i+k-1,n-1);

         while(low<high)
          {
            char temp=a[low];
            a[low]=a[high];
            a[high]=temp;

            low++;
            high--;
          }
        }

        return new String(a);
    }
}