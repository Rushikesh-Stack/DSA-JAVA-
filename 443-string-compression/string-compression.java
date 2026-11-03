class Solution {
    public int compress(char[] ch) {
        int n = ch.length;
        int read = 0;
        int write = 0;

        while (read < n) {

            // Store the current character
            char current = ch[read];
            int cnt = 0;

            // Count consecutive occurrences
            while (read < n && ch[read] == current) {
                read++;
                cnt++;
            }

            // Write the character into the array
            ch[write] = current;
            write++;

            // Write count only if greater than 1
            if (cnt > 1) {
                String count = String.valueOf(cnt);

                // Write each digit of the count
                for (int i = 0; i < count.length(); i++) {
                    ch[write] = count.charAt(i);
                    write++;
                }
            }
        }

        // Return the compressed array length
        return write;
    }
}