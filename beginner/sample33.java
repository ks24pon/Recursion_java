class Solution{
    public static String insertUnderscoreAt(String s, int i){
        // 関数を完成させてください
        if(s.length() <= i) return s;
        return s.substring(0,i) + "_" + s.substring(i);
    }
}