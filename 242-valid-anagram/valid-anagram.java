class Solution {
    public boolean isAnagram(String s, String t) 
    {
         if(s.length() != t.length()) 
         {
            return false;
        }

        int freq[]=new int[26];
        int n1=s.length();
        int n2=t.length();
        int n3=freq.length;

        for(int i=0;i<n1;i++)
        {
            // freq[s.charAt(i)-'a']++;
            char ch=s.charAt(i);
            int idx=ch-'a';
            freq[idx]++;
        }

        for(int i=0;i<n2;i++)
        {
            freq[t.charAt(i)-'a']--;
        }

        for(int i=0;i<n3;i++)
        {
            if(freq[i]!=0)
            {
                return false;
            }
            
        }

        return true;
        
    }
}