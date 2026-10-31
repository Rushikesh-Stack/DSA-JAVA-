class Solution {
    public int strStr(String haystack, String needle) 
    {
         int n1=haystack.length();
         int n2=needle.length();

         int cnt=0;
         for(int i=0;i<=n1-n2;i++)
         {
            cnt=0;

            for(int j=0;j<n2;j++)
            {
                if(haystack.charAt(i+j)==needle.charAt(j))
                {
                    cnt++;
                }
                else{
                    break;
                }
            }

            if(cnt==n2)
            {
                return i;
            }
         }

         return -1;
    }
}