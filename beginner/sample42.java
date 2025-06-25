class Solution{
    public static int recursiveAddition(int m, int n){
        // 関数を完成させてください
        if(n == 0){
            return m;
        }
        return recursiveAddition(m,n-1) + 1;
    }
}