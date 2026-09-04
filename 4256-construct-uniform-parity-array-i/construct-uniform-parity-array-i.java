class Solution {
    public boolean uniformArray(int[] a) {

        int n = a.length;
        int j = -1;

        // Step 1: Find one odd number
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                j = i;
                break;
            }
        }

        // If no odd number exists,
        // all numbers are already even
        if (j == -1) {
            return true;
        }

        // Step 2: Make every even number odd
        for (int i = 0; i < n; i++) {

            if (a[i] % 2 == 0) {
                int result = a[i] - a[j];

                // result will be odd
                // so this element can be made odd
            }
        }

        return true;
    }
}