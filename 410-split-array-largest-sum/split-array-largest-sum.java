
class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;

        int sum = 0;
        int max = 0;

        for (int num : nums) {
            sum += num;
            max = Math.max(max, num);
        }

        int low = max;
        int high = sum;
        int ans = sum;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int subarrays = 1;
            int currentSum = 0;

            for (int i = 0; i < n; i++) {
                if (currentSum + nums[i] <= mid) {
                    currentSum += nums[i];
                } else {
                    subarrays++;
                    currentSum = nums[i];
                }
            }

            if (subarrays <= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
