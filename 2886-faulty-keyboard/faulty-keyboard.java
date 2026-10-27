class Solution {
    public String finalString(String s) {
        char[] a = s.toCharArray();
        int n = s.length();

        int low = 0;
        int high = 0;
        int cnt = 0;

        while (high < n) {
            if (a[high] != 'i') {
                a[cnt] = a[high];
                cnt++;
            } else {
                low = 0;
                int right = cnt - 1;

                while (low < right) {
                    char temp = a[low];
                    a[low] = a[right];
                    a[right] = temp;

                    low++;
                    right--;
                }
            }
            high++;
        }

        return new String(a, 0, cnt);
    }
}