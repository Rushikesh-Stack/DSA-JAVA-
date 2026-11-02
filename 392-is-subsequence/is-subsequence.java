class Solution {
    public boolean isSubsequence(String s, String t) 
    {
       int n=s.length();
       int m=t.length();

       if(n==0)
       return true;

       int low=0;
       int high=0;
       int cnt=0;

       while(high < m && low<n)
       {
          if(s.charAt(low)==t.charAt(high))
          {
            low++;
            high++;
            cnt++;
          }
          else{
            high++;
          } 
       }

       if(cnt==n)
       return true;
       else
       return false;
    }
}