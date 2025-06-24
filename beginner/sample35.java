class Solution {
    public static boolean isValidEmail(String email) {
        int indexOfAt = email.indexOf("@");

        // "@"の後ろの文字列を取り出す
        String afterAt = email.substring(indexOfAt + 1);

        return indexOfAt > 0                             // "@"が先頭以外にある
            && email.indexOf(" ") == -1                 // 空白を含まない
            && afterAt.indexOf("@") == -1               // "@"が1個しかない
            && afterAt.indexOf(".") != -1;              // ドメイン部分に"."がある
    }
}
