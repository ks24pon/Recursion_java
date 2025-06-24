class Solution{
    public static int vacationRental(int people, int day){
        int plan;
        // 清掃費
        final double CLEANING_FEE = 1.12;
        // 全体の金額に税金
        final double TAX = 1.08;

        // 3泊以下の宿泊
        if(day <= 3) plan = 80;
        //　4泊以上の宿泊
        else if(day < 10) plan = 60;
        // それ以外
        else plan = 50;
        return (int)(day * people * plan * CLEANING_FEE * TAX);
    }
}

