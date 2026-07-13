class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            sb.append(c);

            int n = sb.length();

            if (n >= 2) {
                String last = sb.substring(n - 2);

                if (last.equals("AB") || last.equals("CD"))
                    sb.delete(n - 2, n);
            }
        }

        return sb.length();
    }
}