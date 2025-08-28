int romanToInt(char* s)
{
    int map[26] = {0};
    map['I' - 'A'] = 1;
    map['V' - 'A'] = 5;
    map['X' - 'A'] = 10;
    map['L' - 'A'] = 50;
    map['C' - 'A'] = 100;
    map['D' - 'A'] = 500;
    map['M' - 'A'] = 1000;
    int result = 0;
    for (int i = 0; s[i] != '\0'; i++)
    {
        int val = map[s[i] - 'A'];
        int nextVal = 0;
        if (s[i+1] != '\0') {
            nextVal = map[s[i+1] - 'A'];
        }
        if (val < nextVal)
        {
            result -= val;
        }
        else
        {
            result += val;
        }
    }
    return result;
}
