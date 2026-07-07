class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[101];
        int[] ans = new int[2];
        int idx = 0;

        for (int num : nums) {
            if (++freq[num] == 2)
                ans[idx++] = num;
        }

        return ans;
    }
}