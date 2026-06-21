class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int len = 0;

        for (char c : s.toCharArray()) {
            if (set.remove(c))
                len += 2;
            else
                set.add(c);
        }

        return set.isEmpty() ? len : len + 1;
    }
}