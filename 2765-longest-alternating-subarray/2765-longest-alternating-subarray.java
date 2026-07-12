class Solution {
    public int alternatingSubarray(int[] nums) {
        int ans = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            int j = i;

            while (j + 1 < nums.length &&
                   nums[j + 1] - nums[j] == ((j - i) % 2 == 0 ? 1 : -1)) {
                j++;
            }

            if (j > i)
                ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }
}