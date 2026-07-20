class Solution {
    public String reformatNumber(String number) {
        StringBuilder s = new StringBuilder();

        for (char c : number.toCharArray())
            if (Character.isDigit(c))
                s.append(c);

        StringBuilder ans = new StringBuilder();
        int i = 0, n = s.length();

        while (n - i > 4) {
            ans.append(s.substring(i, i + 3)).append("-");
            i += 3;
        }

        if (n - i == 4) {
            ans.append(s.substring(i, i + 2)).append("-");
            ans.append(s.substring(i + 2));
        } else {
            ans.append(s.substring(i));
        }

        return ans.toString();
    }
}