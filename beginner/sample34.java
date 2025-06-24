class Solution{
    public static String lastFourHint(String stringInput){
        // 関数を完成させてください
        if(stringInput.length() < 6)return "There is no Hint";
        String hint = stringInput.substring(stringInput.length() - 4);
        return "Hint is:" + hint;
    }
}