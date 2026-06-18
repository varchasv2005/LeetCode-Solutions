class Solution {
    List<String> ans = new ArrayList<>();
    String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return ans;

        backtrack(0, digits, new StringBuilder());
        return ans;
    }

    private void backtrack(int idx, String digits, StringBuilder curr) {
        if (idx == digits.length()) {
            ans.add(curr.toString());
            return;
        }

        String letters = map[digits.charAt(idx) - '0'];

        for (char c : letters.toCharArray()) {
            curr.append(c);
            backtrack(idx + 1, digits, curr);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}