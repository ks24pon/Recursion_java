class Solution {
    public static int divideBy3Count(int n) {
        if (n % 3 != 0) return 0; // もう3で割れない
        return 1 + divideBy3Count(n / 3);
    }
}