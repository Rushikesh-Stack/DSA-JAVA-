class Solution {
    public boolean uniformArray(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                return true;
            }
        }

        return true;
    }
}