int maxProfit(int* prices, int pricesSize)
{
    int min = prices[0];
    int max = 0;
    for (int i = 1; i < pricesSize; i++)
    {
        int cost = prices[i] - min;
        max = fmax(max, cost);
        min = fmin(min, prices[i]);
    }
    return max;
}