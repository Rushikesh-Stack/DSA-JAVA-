class Solution {
    public String reverseWords(String s) 
    {
       int n=s.length();

       String str[]=s.split(" ");



       for(int i=0;i<str.length;i++)
       {
        StringBuilder sb = new StringBuilder(str[i]);
        sb.reverse();

         str[i] = sb.toString();    
          
       } 

       return String.join(" ", str);
    }
}