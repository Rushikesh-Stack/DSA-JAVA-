class Solution {
    public String toLowerCase(String s) 
    {
        int n=s.length();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
            {
                ch = (char)(ch + 32);
            }

            sb.append(ch);
        }

        return sb.toString();
    }
}