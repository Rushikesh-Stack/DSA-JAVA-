class Solution {
    public int minimumDeletions(int[] a) 
    {
        int n=a.length;
        int max=a[0];
        int maxIdx=0;
        int minIdx=0;
        int min=a[0];

        for(int i=1;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                maxIdx=i;
            }
            if(a[i]<min)
            {
                min=a[i];
                minIdx=i;
            }
        }

        //For Front:
        int needed1=Math.max(maxIdx,minIdx)+1;

        //For back:
        int needed2=n-Math.min(maxIdx,minIdx);

        //max from front & min from back
        int mix1=(maxIdx+1)+(n- minIdx);

        //min from back & max from front
        int mix2=(minIdx+1)+ (n-maxIdx);

        int m1=Math.min(needed1,needed2);
        int m2=Math.min(mix1,mix2);
        int ans=Math.min(m1,m2);

        return ans;

    }
}