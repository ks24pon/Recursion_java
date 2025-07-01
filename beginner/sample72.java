class Solution{
    public static boolean isPalindromeInteger(int n){
        // 数値nを文字列に変換
        String str = String.valueOf(n);

        // 両端から文字を比較
        int left = 0;
        int right = str.length() -1;

        while(left < right) {
            // 左右の文字が異なれば回文ではない
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            // 内側に移動
            left++;
            right--;
        }
        // 全ての文字が一致すれば回文
        return true;
    }
}