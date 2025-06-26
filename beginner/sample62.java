class Solution {
    public static int multipleOfTwoTotal(int n) {
        if (n == 1) return 2; // ベースケース：2×1 = 2
        return sumOfTwos(n) + multipleOfTwoTotal(n - 1);
    }

    public static int sumOfTwos(int n) {
        return n * (n + 1); // 2 × (n(n+1)/2) = n(n+1)
    }
}