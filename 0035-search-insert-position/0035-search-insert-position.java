class Solution
{
    public int searchInsert(int[] nums, int target)
    {
        int ans = 0;
        
        if (target > nums[nums.length - 1])
        {
            return nums.length;
        }

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == target)
            {
                ans = i;
                break;
            }
        }
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] < target && nums[i+1] > target)
            {
                ans = i + 1;
                break;
            }
        }
        return ans;
    }
}