class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        int n=strs.length;
        String str1=strs[0];

        int cnt=0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            cnt=0;
            for(int j=0;j<strs[i].length() && j<str1.length();j++)
            {
                if(str1.charAt(j)==strs[i].charAt(j))
                {
                    cnt++;
                }
                else{
                    break;
                }
            }
            min=Math.min(cnt,min);
        }

        return str1.substring(0,min);
    }
}