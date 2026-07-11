class Solution {
    public int splitNum(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        Arrays.sort(arr);

        int a = 0, b = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                a = a * 10 + (arr[i] - '0');
            else
                b = b * 10 + (arr[i] - '0');
        }

        return a + b;
    }
}