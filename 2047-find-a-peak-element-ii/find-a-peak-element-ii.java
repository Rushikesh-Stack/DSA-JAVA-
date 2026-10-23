
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0;
        int high = cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int peakRow = 0;

            // Find maximum element in the middle column
            for (int i = 1; i < rows; i++) {
                if (mat[i][mid] > mat[peakRow][mid]) {
                    peakRow = i;
                }
            }

            int result = binarySearch(mat, peakRow, mid);

            if (result == 1) {
                return new int[]{peakRow, mid};
            } else if (result == 2) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }

    int binarySearch(int[][] mat, int row, int col) {
        int rows = mat.length;
        int cols = mat[0].length;

        int curr = mat[row][col];

        int left = (col > 0) ? mat[row][col - 1] : -1;
        int right = (col < cols - 1) ? mat[row][col + 1] : -1;

        if (curr > left && curr > right) {
            return 1;  // Peak found
        } else if (right > curr) {
            return 2;  // Search right
        } else {
            return 0;  // Search left
        }
    }
}
