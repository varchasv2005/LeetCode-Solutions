class Solution {
    public int maximumCount(int[] nums) {
        int neg = lowerBound(nums, 0);
        int pos = nums.length - upperBound(nums, 0);
        return Math.max(neg, pos);
    }

    private int lowerBound(int[] nums, int target) {
        int l = 0, r = nums.length;

        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] < target)
                l = m + 1;
            else
                r = m;
        }

        return l;
    }

    private int upperBound(int[] nums, int target) {
        int l = 0, r = nums.length;

        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] <= target)
                l = m + 1;
            else
                r = m;
        }

        return l;
    }
}