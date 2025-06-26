class Solution {
    public static int maximumPeople(int x, int y) {
        return gcd(x, y);
    }

    private static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}