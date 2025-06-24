class Solution{
    public static int howMuchIsYourDebt(int year){
        // 関数を完成させてください
        final int INITIAL_FEE = 10_000;

        return (int) (INITIAL_FEE * Math.pow(1.2, year));
    }
}