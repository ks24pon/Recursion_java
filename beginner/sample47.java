class Solution{
    public static String swapPosition(String s){
        // 関数を完成させてください
        if (s.length() <= 1){
            return s;
        }
        return s.substring(1,2) + s.substring(0,1) + swapPosition(s.substring(2));
    }
}