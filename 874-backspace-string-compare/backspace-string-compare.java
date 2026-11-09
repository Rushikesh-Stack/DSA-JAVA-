class Solution {
    public boolean backspaceCompare(String s, String t) {

        int low = s.length() - 1;
        int high = t.length() - 1;

        while (low >= 0 || high >= 0) {

            int cnt1 = 0;
            int cnt2 = 0;

            // Find next valid character in s
            while (low >= 0) {
                if (s.charAt(low) == '#') {
                    cnt1++;
                    low--;
                }
                else if (cnt1 > 0) {
                    cnt1--;
                    low--;
                }
                else {
                    break;
                }
            }

            // Find next valid character in t
            while (high >= 0) {
                if (t.charAt(high) == '#') {
                    cnt2++;
                    high--;
                }
                else if (cnt2 > 0) {
                    cnt2--;
                    high--;
                }
                else {
                    break;
                }
            }

            // Check if both strings are exhausted
            if (low < 0 && high < 0) {
                return true;
            }

            // Check if only one string is exhausted
            if (low < 0 || high < 0) {
                return false;
            }

            // Compare the next valid characters
            if (s.charAt(low) != t.charAt(high)) {
                return false;
            }

            // Move both pointers backwards
            low--;
            high--;
        }

        return true;
    }
}