class Solution{
    public static boolean checkLastDigits(int x, int y, int z){
        return (x * y) % 10 == z % 10;
    }
}