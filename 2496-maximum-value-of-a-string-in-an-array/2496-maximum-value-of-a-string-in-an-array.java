class Solution {
    public int maximumValue(String[] strs) {
        int ans = 0;

        for (String s : strs) {
            boolean numeric = true;

            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    numeric = false;
                    break;
                }
            }

            if (numeric)
                ans = Math.max(ans, Integer.parseInt(s));
            else
                ans = Math.max(ans, s.length());
        }

        return ans;
    }
}