class Solution {
    public static String doYouFail(String string) {
        // 欠席の回数をカウントする変数を初期化
        int absenceCount = 0;

        // 文字列の長さ分ループを回す
        for (int i = 0; i < string.length(); i++) {
            // i番目の文字が 'A'（欠席）であるかをチェック
            if (string.charAt(i) == 'A') {
                // 欠席の回数を1回増やす
                absenceCount++;

                // 欠席が3回以上になったら、単位取得不可なので "fail" を返す
                if (absenceCount >= 3) {
                    return "fail";
                }
            }
        }

        // ループが終わっても欠席が3回未満なら単位取得可能なので "pass" を返す
        return "pass";
    }
}
