class Solution {
    public static String irreducibleFraction(int x, int y) {
        int gcd = gcd(x, y);
        int numerator = x / gcd;
        int denominator = y / gcd;

        // 分母が1なら「整数」として返す
        if (denominator == 1) {
            return String.valueOf(numerator);
        }

        // それ以外は「a/b」の形で返す
        return numerator + "/" + denominator;
    }

    // 最大公約数（ユークリッドの互除法）
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}