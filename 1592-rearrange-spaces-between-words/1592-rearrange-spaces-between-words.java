class Solution {
    public String reorderSpaces(String text) {
        String[] words = text.trim().split("\\s+");

        int spaces = 0;
        for (char c : text.toCharArray())
            if (c == ' ')
                spaces++;

        if (words.length == 1)
            return words[0] + " ".repeat(spaces);

        int between = spaces / (words.length - 1);
        int extra = spaces % (words.length - 1);

        return String.join(" ".repeat(between), words)
                + " ".repeat(extra);
    }
}