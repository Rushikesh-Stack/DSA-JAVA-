
class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int rows = a.length;

        for (int i = 0; i < rows; i++) {
            int found = lowerBound(a[i], target);

            if (found != -1 && a[i][found] == target) {
                return true;
            }
        }

        return false;
    }

    int lowerBound(int[] a, int target) {
        int low = 0;
        int high = a.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
