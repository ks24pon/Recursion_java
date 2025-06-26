class Solution {
    public static boolean recursiveIsPrime(int n) {
        if (n <= 1) return false; // 1以下は素数ではない
        return isPrimeHelper(n, 2); // 2から割っていく
    }

    private static boolean isPrimeHelper(int n, int divisor) {
        if (divisor * divisor > n) {
            // √n より大きな数まで試す必要なし
            return true;
        }
        if (n % divisor == 0) {
            // 割り切れたら素数ではない
            return false;
        }
        return isPrimeHelper(n, divisor + 1); // 次の割る数へ
    }
}
