class Solution{
    public static boolean isPerfectSquare(int x, int y){
        return hasDecimal(distance(x, y));
    }

    public static boolean hasDecimal(double v){
        return v % 1 == 0;
    }

    public static double distance(int x, int y){
        return Math.sqrt(x * x + y * y);
    }
}