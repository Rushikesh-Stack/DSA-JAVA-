class Solution {
    public boolean validPalindrome(String s) 
    {
        int n=s.length();
        int low=0;
        int high=n-1;
        int ans=1;

        while(low<=high)
        {
            if(s.charAt(low)==s.charAt(high))
            {
                low++;
                high--;
            }
            else{

                if( isPalindrome(s,low+1, high) ||
                    isPalindrome(s,low, high-1) )
                    {
                        ans=1;
                    }
                else{
                        ans=0;
                    }

                 break;
            }
        }

        if(ans==0)
        return false;
        else
        return true;
    }

     public static boolean isPalindrome(String s, int low, int high) {

        while (low < high) {

            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }

            low++;
            high--;
        }

        return true;
    }
}