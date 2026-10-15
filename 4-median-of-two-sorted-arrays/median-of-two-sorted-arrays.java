class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int i = 0, j = 0;
        int prev = 0, curr = 0;

        int total = n + m;
        int mid = total / 2;

        for (int count = 0; count <= mid; count++) {
            prev = curr;

            if (i < n && (j >= m || nums1[i] <= nums2[j])) {
                curr = nums1[i];
                i++;
            } else {
                curr = nums2[j];
                j++;
            }
        }

        if (total % 2 == 0) {
            return (prev + curr) / 2.0;
        }

        return curr;
    }
}