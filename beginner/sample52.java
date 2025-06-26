class Solution{
    public static int countDivisibleByK(int n, int k){
        // 関数を完成させてください
        if(n % k != 0)return 0;
        return countDivisibleByK(n / k, k) + 1;
    }
}