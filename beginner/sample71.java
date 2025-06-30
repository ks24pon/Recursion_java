class Solution {
    public static String perfectNumberList(int n) {
        // 出力文字列を保持する変数（StringBuilderが効率的）
        StringBuilder perfectNumStr = new StringBuilder();

        for (int i = 2; i <= n; i++) {
            int sumOfDivisor = 0;

            // i の約数の合計（ただし i 自身を除く）
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sumOfDivisor += j;
                }
            }

            // i が完全数なら、結果に追加
            if (sumOfDivisor == i) {
                perfectNumStr.append(i).append("-");
            }
        }

        // 結果が空でなければ、末尾の "-" を削除
        if (perfectNumStr.length() > 0) {
            perfectNumStr.setLength(perfectNumStr.length() - 1); // 最後の "-" を削除
        }

        return perfectNumStr.toString();
    }
}
