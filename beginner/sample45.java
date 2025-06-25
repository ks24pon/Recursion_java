class Solution{
    public static long factorial(int n){
        // 関数を完成させてください
        if(n <= 0){
            return 1;
        }
        return factorial(n-1) * n;
    }
}