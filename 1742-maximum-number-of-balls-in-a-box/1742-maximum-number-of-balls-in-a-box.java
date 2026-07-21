class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] box = new int[46];
        int ans = 0;
        for (int i = lowLimit; i <= highLimit; i++)
        {
            int sum = 0, x = i;
            while (x > 0)
            {
                sum += x % 10;
                x /= 10;
            }
            ans = Math.max(ans, ++box[sum]);
        }
        return ans;
    }
}