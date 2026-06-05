class Solution
{
    public int reverse(int x)
    {
        int neg = 0;

        if (x < 0)
        {
            neg++;
            x = -x;
        }

        int y = 0;

        while (x > 0)
        {
            
            if (y > Integer.MAX_VALUE / 10 ||(y == Integer.MAX_VALUE / 10 && x % 10 > 7))
            {
                return 0;
            }
            
            y = y * 10 + x % 10;
            x = x / 10;
        }

        if (neg > 0)
        {
            y = -y;
        }

        return y;
    }
}