class Solution {
    public String removeDuplicates(String s) 
    {
        int n=s.length();
        int low=0;
        int high=1;

        StringBuilder sb=new StringBuilder(s);
        while(high < sb.length())
        {
            if(sb.charAt(low)==sb.charAt(high))
            {
                sb.delete(low, high+1);
                
                if(low>0)
                {
                    low--;
                }
                else{
                    low=0;
                }

                high=low+1;
            }
            else{
                low++;
                high++;
            }

        }

        return sb.toString();

    }
}