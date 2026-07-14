class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);

        return Math.max(amount[2], (amount[0] + amount[1] + amount[2] + 1) / 2);
    }
}