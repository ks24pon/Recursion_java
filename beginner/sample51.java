class Solution{
    public static String reverseString(String s){
        // 関数を完成させてください
        if(s.isEmpty()) {
            return "";
        }
        return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
    }
}