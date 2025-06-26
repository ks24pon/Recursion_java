class Solution {
    public static int splitAndAdd(int digits) {
        if (digits == 0) {
            return 0;  // ベースケース：もう桁がない
        }
        return (digits % 10) + splitAndAdd(digits / 10);
    }
}