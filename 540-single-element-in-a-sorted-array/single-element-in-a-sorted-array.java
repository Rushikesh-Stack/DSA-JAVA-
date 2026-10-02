class Solution {
    public int singleNonDuplicate(int[] a) {

        int n = a.length;

        if(n == 1)
            return a[0];

        for(int i = 0; i < n; i++)
        {
            if(i == 0)
            {
                if(a[i] != a[i + 1])
                    return a[i];
            }
            else if(i == n - 1)
            {
                if(a[i] != a[i - 1])
                    return a[i];
            }
            else
            {
                if(a[i] != a[i - 1] && a[i] != a[i + 1])
                    return a[i];
            }
        }

        return -1;
    }
}