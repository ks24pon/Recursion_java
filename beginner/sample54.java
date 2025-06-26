class Solution {
    public static int threeGCD(int x, int y, int z) {
        return gcd(gcd(x, y), z);
    }

    // 2つの数の最大公約数を求める関数
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}