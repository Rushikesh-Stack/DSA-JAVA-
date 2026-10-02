class Solution {
    public int singleNonDuplicate(int[] a) {

        int n = a.length;

        if(n == 1)
            return a[0];

        int low = 1;
        int high = n - 2;

        if(a[0] != a[1])
            return a[0];

        if(a[n - 1] != a[n - 2])
            return a[n - 1];

        while(low <= high)
        {
            int mid = (low + high) / 2;

            // mid itself is single
            if(a[mid] != a[mid - 1] &&
               a[mid] != a[mid + 1])
            {
                return a[mid];
            }

            // mid is paired with left
            if(a[mid] == a[mid - 1])
            {
                if(mid % 2 == 1)
                    low = mid + 1;
                else
                    high = mid - 1;
            }

            // mid is paired with right
            else if(a[mid] == a[mid + 1])
            {
                if(mid % 2 == 0)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }
}