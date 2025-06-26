class Solution {
    public static int countSquare(int x, int y) {
        int g = gcd(x, y);
        return (x * y) / (g * g);
    }

    // ユークリッドの互除法（再帰）で最大公約数を求める
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}