void rotate(int* nums, int numsSize, int k)
{
    k = k % numsSize; // handle k > numsSize

    // reverse whole array
    int left = 0, right = numsSize - 1;
    while (left < right)
    {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
    }

    // reverse first k elements
    left = 0; right = k - 1;
    while (left < right)
    {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
    }

    // reverse remaining elements
    left = k; right = numsSize - 1;
    while (left < right)
    {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
    }
}
