class Solution {
    public static boolean isPrime(int number) {
        if (number <= 1) return false; // 1以下は素数ではない
        if (number == 2) return true;  // 2は最小の素数

        // 2以外の偶数は素数ではない
        if (number % 2 == 0) return false;

        // 奇数だけチェック（2の倍数を除外済）
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false; // 割り切れたら素数ではない
            }
        }

        return true; // どれにも割り切れなければ素数
    }
}
