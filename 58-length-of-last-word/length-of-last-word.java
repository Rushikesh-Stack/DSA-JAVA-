class Solution {
    public int lengthOfLastWord(String s) 
    {
       int n=s.length();

       int low=n-1;
       int cnt=0;
       while(low>=0)
       {
         if(s.charAt(low)==' ' && cnt==0)
         {
            low--;
         }

         else if(s.charAt(low)==' ')
         {
            break;
         }
         else{
            cnt++;
            low--;
         }
         
       }
        return cnt;
    }
}