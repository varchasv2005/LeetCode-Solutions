void sortColors(int* nums, int numsSize)
{
    for (int i = 1; i < numsSize; i++)
    {
        int temp;
        if (nums[i-1] > nums[i])
        {
            temp = nums[i-1];
            nums[i-1] = nums[i];
            nums[i] = temp;
            i = 0;
        }
    }
}