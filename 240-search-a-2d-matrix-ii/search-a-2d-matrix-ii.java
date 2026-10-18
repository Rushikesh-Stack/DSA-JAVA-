
class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int rows = a.length;
        int cols = a[0].length;
        boolean flag = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (a[i][j] == target) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                break;
            }
        }

        return flag;
    }
}
