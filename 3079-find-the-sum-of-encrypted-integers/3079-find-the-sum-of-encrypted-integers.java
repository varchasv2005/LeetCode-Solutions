class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            int maxDigit = 0;
            int digits = 0;
            int temp = num;

            while (temp > 0) {
                maxDigit = Math.max(maxDigit, temp % 10);
                digits++;
                temp /= 10;
            }

            int encrypted = 0;

            while (digits-- > 0)
                encrypted = encrypted * 10 + maxDigit;

            sum += encrypted;
        }

        return sum;
    }
}