class Solution{
    public static int infectedPeople(int day){
        // 関数を完成させてください
        if(day == 1){
            return 2;
        }

        return infectedPeople(day - 1) * 2;
    }
}