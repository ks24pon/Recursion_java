class Solution {
    public static String decimalToBinary(int decNumber) {
        // ベースケース：0のときは "0" を返す
        if (decNumber == 0) {
            return "0";
        }

        // 結果の2進数文字列を構築する
        String binary = "";

        // decNumber が 0 になるまで 2 で割りながら余りを追加
        while (decNumber > 0) {
            int remainder = decNumber % 2;              // 2で割った余り（0か1）
            binary = remainder + binary;                // 先頭に追加（逆順に並べるため）
            decNumber = decNumber / 2;                  // 商に更新して次へ
        }

        return binary;
    }
}