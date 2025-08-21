// helper to reverse part of array
void reverse(int* arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

void rotate(int* nums, int numsSize, int k) {
    if (numsSize <= 1) return;

    k = k % numsSize;  // normalize k
    if (k == 0) return;

    // Step 1: Reverse first n-k elements
    reverse(nums, 0, numsSize-k-1);

    // Step 2: Reverse last k elements
    reverse(nums, numsSize-k, numsSize-1);

    // Step 3: Reverse the whole array
    reverse(nums, 0, numsSize-1);
}
