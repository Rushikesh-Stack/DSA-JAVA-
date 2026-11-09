class Solution {
    public boolean backspaceCompare(String s, String t) {

        String result1 = process(s);
        String result2 = process(t);

        return result1.equals(result2);
    }

    public String process(String s) {

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) == '#') {

                sb.deleteCharAt(i);

                if (i > 0) {
                    sb.deleteCharAt(i - 1);
                    i = i - 2;
                } else {
                    i--;
                }
            }
        }

        return sb.toString();
    }
}