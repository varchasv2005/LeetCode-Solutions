/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* rearrangeArray(int* nums, int numsSize, int* returnSize)
{
    int pos[numsSize/2];
    int posc = 0;
    int neg[numsSize/2];
    int negc = 0;
    for (int i = 0; i < numsSize; i++)
    {
        if (nums[i] > 0)
        {
            pos[posc++] = nums[i];
        }
        if (nums[i] < 0)
        {
            neg[negc++] = nums[i];
        }
    }
    int* final = (int*)malloc(numsSize * sizeof(int));
    int i = 0, p = 0, q = 0;
    while (p < posc && q < negc)
    {
        final[i++] = pos[p++];
        final[i++] = neg[q++];
    }
    *returnSize = numsSize;
    return final;
}