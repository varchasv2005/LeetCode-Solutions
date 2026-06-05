class Solution
{
    public boolean isPalindrome(int x)
    {
        int y = 0;

        int copy = x;
        
        if (x < 0)
        {
            return false;
        }
        
        while (x > 0)
        {
            y = (y * 10) + (x % 10);
            x = x / 10;
        }

        if (copy == y)
        {
            return true;
        }
        return false;
    }
}