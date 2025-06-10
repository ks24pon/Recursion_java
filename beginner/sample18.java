class Solution{
    public static int quadraticEquation(int a, int b, int c){
        // 判別式
        int d = b * b - 4 * a * c;
        //二次の係数が 0 のとき、0
        if(a == 0)return 0;
        // 重解
        if(d == 0)return 1;
        // 実数解が2つ
        else if(d > 0) return 2;
        // 虚数解が2つ
        else return -2;
    }
}

