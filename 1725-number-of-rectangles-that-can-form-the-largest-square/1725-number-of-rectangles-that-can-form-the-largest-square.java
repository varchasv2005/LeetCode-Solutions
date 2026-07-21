class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max = 0, ans = 0;
        for (int[] r : rectangles)
        {
            int side = Math.min(r[0], r[1]);
            if (side > max)
            {
                max = side;;
                ans = 1;
            }
            else if (side == max)
            {
                ans++;
            }
        }
        return ans;
    }
}