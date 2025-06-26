class Solution {
    public static String stringCompression(String s) {
        return compressHelper(s, 0, 1);
    }

    // s: 入力文字列
    // i: 現在注目している文字のインデックス
    // count: 現在の文字が何回続いているか
    private static String compressHelper(String s, int i, int count) {
        if (i == s.length() - 1) {
            // 最後の1文字を処理する
            return s.charAt(i) + (count > 1 ? String.valueOf(count) : "");
        }

        // 次の文字と同じならカウントを増やして再帰
        if (s.charAt(i) == s.charAt(i + 1)) {
            return compressHelper(s, i + 1, count + 1);
        } else {
            // 違う文字なら現在の文字とカウントを出力し、次の文字へ
            String current = s.charAt(i) + (count > 1 ? String.valueOf(count) : "");
            return current + compressHelper(s, i + 1, 1);
        }
    }
}