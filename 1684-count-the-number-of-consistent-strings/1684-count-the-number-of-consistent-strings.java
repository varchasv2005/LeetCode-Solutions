class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();

        for (char c : allowed.toCharArray())
            set.add(c);

        int ans = 0;

        for (String word : words) {
            boolean ok = true;

            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    ok = false;
                    break;
                }
            }

            if (ok)
                ans++;
        }

        return ans;
    }
}