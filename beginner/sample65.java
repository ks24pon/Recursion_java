class Solution {
    public static int howLongToReachFundGoal(int capitalMoney, int goalMoney, int interest) {
        return helper(capitalMoney, goalMoney, interest, 0);
    }

    private static int helper(double capital, double goal, int interest, int year) {
        if (year >= 80) return 80;              // 寿命制限
        if (capital >= goal) return year;       // 資金が目標に到達したら終了

        // 年利で複利運用
        capital += capital * interest / 100.0;

        // 土地の価格上昇（偶数年：2%、奇数年：3%）
        if (year % 2 == 0) {
            goal += goal * 0.02;
        } else {
            goal += goal * 0.03;
        }

        return helper(capital, goal, interest, year + 1);
    }
}
