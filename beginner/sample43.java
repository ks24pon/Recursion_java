class Solution{
    public static int lenString(String string){
        // 関数を完成させてください
        if(string.isEmpty()){
            return 0;
        }

        return lenString(string.substring(0, string.length() -1)) + 1;
    }
}