class Solution {
    public int findKthPositive(int[] arr, int k) 
    {
        int n=arr.length;
        int cnt=0;
        boolean found=false;

        int max=0;
        for(int i:arr)
        {
            max=Math.max(i,max);
        }

        for(int i=1;i<=max+k;i++)
        {
            found=false;
            for(int num=0;num<n;num++)
            {
                if(arr[num]==i)
                {
                    found=true;
                    break;
                }
            }

            if(!found)
            {
                cnt++;
            }
            
            if(cnt==k)
            {
                return i;
            }
        }

        return -1;
    }
}