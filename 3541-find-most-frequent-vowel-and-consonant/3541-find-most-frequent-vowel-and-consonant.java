class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray())
            freq[c - 'a']++;

        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowel = Math.max(vowel, freq[i]);
            else
                consonant = Math.max(consonant, freq[i]);
        }

        return vowel + consonant;
    }
}