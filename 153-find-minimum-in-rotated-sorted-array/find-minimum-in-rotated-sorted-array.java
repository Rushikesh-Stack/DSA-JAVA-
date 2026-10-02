class Solution {
    public int findMin(int[] a) {

        int low = 0;
        int high = a.length - 1;

        int ans = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = (low + high) / 2;

            // Left half is sorted
            if (a[low] <= a[mid]) {

                ans = Math.min(ans, a[low]);

                // Search right half
                low = mid + 1;
            }

            // Left half is not sorted
            else {

                ans = Math.min(ans, a[mid]);

                // Search left half
                high = mid - 1;
            }
        }

        return ans;
    }
}