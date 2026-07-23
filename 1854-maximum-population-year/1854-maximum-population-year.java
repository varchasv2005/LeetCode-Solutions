class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];

        for (int[] log : logs) {
            years[log[0] - 1950]++;
            years[log[1] - 1950]--;
        }

        int max = 0, year = 1950, cur = 0;

        for (int i = 0; i < 101; i++) {
            cur += years[i];

            if (cur > max) {
                max = cur;
                year = i + 1950;
            }
        }

        return year;
    }
}