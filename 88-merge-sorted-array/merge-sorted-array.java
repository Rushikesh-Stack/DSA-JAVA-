class Solution {
    public void merge(int[] a1, int m, int[] a2, int n) {

        // If a2 is empty, nothing to merge
        if(n == 0)
            return;

        // Compare elements of a1 with the smallest element of a2
        for(int i = 0; i < m; i++)
        {
            if(a1[i] > a2[0])
            {
                // Swap
                int temp = a1[i];
                a1[i] = a2[0];
                a2[0] = temp;

                // Restore sorted order of a2
                int j = 0;

                while(j < n - 1 && a2[j] > a2[j + 1])
                {
                    int temp2 = a2[j];
                    a2[j] = a2[j + 1];
                    a2[j + 1] = temp2;

                    j++;
                }
            }
        }

        // Copy a2 into the empty space of a1
        for(int i = 0; i < n; i++)
        {
            a1[m + i] = a2[i];
        }
    }
}