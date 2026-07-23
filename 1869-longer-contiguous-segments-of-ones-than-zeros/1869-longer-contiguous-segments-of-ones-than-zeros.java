class Solution {
    public boolean checkZeroOnes(String s) {
        int one = 0, zero = 0;
        int c1 = 0, c0 = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                c1++;
                c0 = 0;
            } else {
                c0++;
                c1 = 0;
            }

            one = Math.max(one, c1);
            zero = Math.max(zero, c0);
        }

        return one > zero;
    }
}