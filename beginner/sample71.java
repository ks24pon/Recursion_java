class Solution {
    public static String perfectNumberList(int n) {
        // 完全数を格納するための StringBuilder（効率のため）
        StringBuilder result = new StringBuilder();

        // 2 から n までループ
        for (int i = 2; i <= n; i++) {
            int sum = 0;

            // i の約数（i 自身を除く）を合計
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            // 約数の合計が i と等しいなら完全数
            if (sum == i) {
                result.append(i).append("-");
            }
        }

        // 完全数が1つも見つからなかった場合
        if (result.length() == 0) {
            return "none";
        }

        // 最後の "-" を削除して文字列を返す
        result.setLength(result.length() - 1);
        return result.toString();
    }
}
