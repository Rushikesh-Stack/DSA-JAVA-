
class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int rows = a.length;
        int cols = a[0].length;

        for (int i = 0; i < rows; i++) {
            if (a[i][0] <= target && target <= a[i][cols - 1]) {
                if (binarySearch(a[i], target)) {
                    return true;
                }
            }
        }

        return false;
    }

    boolean binarySearch(int[] a, int target) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == target) {
                return true;
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
