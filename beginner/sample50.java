class Solution{
    public static String sheeps(int count){
        // 関数を完成させてください
        if(count <= 1){
            return count + " sheep ~ ";
        } else {
            return sheeps(count-1) + count + " sheep ~ ";
        }
    }
}