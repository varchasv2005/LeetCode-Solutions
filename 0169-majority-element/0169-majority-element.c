int majorityElement(int* nums, int numsSize)
{
    int temp = nums[0];
    int count = 1;
    for (int i = 1; i < numsSize; i++)
    {
        if (nums[i] == temp)
        {
            count++;
        }
        else
        {
            count--;
            if (count == 0)
            {
                temp = nums[i];
                count = 1;
            }
        }
    }
    return temp;
}
