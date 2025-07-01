class Solution {
    public static String oneComplement(String bits) {
        // 結果を作るためのStringBuilder
        StringBuilder result = new StringBuilder();

        // 各文字を1つずつ見て、0なら1、1なら0を追加
        for (int i = 0; i < bits.length(); i++) {
            char bit = bits.charAt(i);
            if (bit == '0') {
                result.append('1');
            } else if (bit == '1') {
                result.append('0');
            }
        }

        // 文字列にして返す
        return result.toString();
    }
}
