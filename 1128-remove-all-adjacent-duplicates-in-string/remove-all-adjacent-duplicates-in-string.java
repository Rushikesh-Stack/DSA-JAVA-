class Solution {
    public String removeDuplicates(String s) {

        int n = s.length();

        // Create an empty StringBuilder to use as a Stack
        StringBuilder sb = new StringBuilder();

        // Traverse each character of the original string
        for (int i = 0; i < n; i++) {

            // Get the current character
            char ch = s.charAt(i);

            /*
             * Check two conditions:
             * 1. Stack should not be empty.
             * 2. Current character should match the top character.
             */
            if (sb.length() > 0 &&
                sb.charAt(sb.length() - 1) == ch) {

                // Remove the top character because it forms a duplicate pair
                sb.deleteCharAt(sb.length() - 1);

            } 
            else {

                // If characters are different, push current character
                sb.append(ch);
            }
        }

        // Convert StringBuilder into String and return the result
        return sb.toString();
    }
}