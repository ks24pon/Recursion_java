class Solution {
    public static int calculateGoalMoney(int capital, int year){
        //関数を作成してください
        return (int) (capital * Math.pow(1 + calculateInterestRate(capital), year));
    }
    
    public static double calculateInterestRate(int capital) {
        if (capital % 2 == 0) {
            return 0.02;
        } else {
            return 0.03;
        }
    }
}