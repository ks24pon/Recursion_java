class Solution {
    public static int intSquareRoot(int n) {
        return helper(n, 1);
    }

    // 現在の候補 x を1から順にチェック
    private static int helper(int n, int x) {
        if (x * x > n) {
            return x - 1;
        }
        return helper(n, x + 1);
    }
}