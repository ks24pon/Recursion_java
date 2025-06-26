class Solution {
    public static String divisor(int number) {
        return helper(number, 1);
    }

    private static String helper(int number, int current) {
        // ベースケース：number まで到達した
        if (current > number) return "";

        // 約数であれば追加
        if (number % current == 0) {
            String rest = helper(number, current + 1);
            // 最後の値のあとにはハイフンをつけない
            if (rest.isEmpty()) {
                return String.valueOf(current);
            } else {
                return current + "-" + rest;
            }
        } else {
            // 約数でなければスキップして次へ
            return helper(number, current + 1);
        }
    }
}
