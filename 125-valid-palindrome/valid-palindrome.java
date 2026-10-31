class Solution {
    public boolean isPalindrome(String s) 
    {
        int n=s.length();

        String s1=s.toLowerCase();

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<n;i++)
        {
            char ch=s1.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                sb.append(ch);
            }
        }

        int low=0;
        int high=sb.length()-1;
        String orignal=sb.toString();

        while(low<high)
        {
            char temp=sb.charAt(low);
            sb.setCharAt(low,sb.charAt(high));
            sb.setCharAt(high, temp);

            low++;
            high--;
        }

        if(orignal.equals(sb.toString()))
        {
            return true;
        }
        else {
            return false;
        }
    }
}