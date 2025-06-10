class Solution{
    public static String whoIsWinner(int hisCard){
        if(hisCard == 2 || hisCard == 1) return "you lose";
        else if(hisCard > 10) return "you lose";
        else if(hisCard < 10) return "you win";
        return "draw";
    }
}

