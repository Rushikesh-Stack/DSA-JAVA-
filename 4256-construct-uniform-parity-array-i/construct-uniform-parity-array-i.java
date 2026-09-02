class Solution {
    public boolean uniformArray(int[] a1) 
    {
        int n=a1.length;
        int a2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(a1[i]%2==0)
            {
                a2[i]=a1[i];
            }
            else{
                a1[i]++;
                a2[i]=a1[i];
            }
        }

        //check for all it all are even or odds
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(a1[i]%2==0)
            {
                 cnt++;  
            }
            else {
                break;
            }

        }

        if(cnt==n)
        {
            return true;
        }
        else{
            return false;
        }
    }
}