class Solution {
    public boolean isPalindrome(String s) {

        int low = 0;
        int high = s.length() - 1;

        while (low < high) {

            // Skip special characters from left
            if (!Character.isLetterOrDigit(s.charAt(low))) {
                low++;
            }

            // Skip special characters from right
            else if (!Character.isLetterOrDigit(s.charAt(high))) {
                high--;
            }

            // Compare characters
            else {
                char ch1 = Character.toLowerCase(s.charAt(low));
                char ch2 = Character.toLowerCase(s.charAt(high));

                if (ch1 != ch2) {
                    return false;
                }

                low++;
                high--;
            }
        }

        return true;
    }
}