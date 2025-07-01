class Solution {
    // 素数かどうかを判定する関数
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // 素数の合計を求める関数
    public static int sumOfAllPrimes(int n) {
        int sum = 0;

        // 1 から n までの整数をチェック
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }
}