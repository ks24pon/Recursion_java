class Solution{
    public static boolean isSwapBigger(int n){
        int tenDigit = n / 10;
        int oneDigit = n % 10;
        return n <= oneDigit * 10 + tenDigit;
    }
}

