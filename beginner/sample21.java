class Solution{
    public static String screenViewMode(int height, int width){
        if(height >= width){
            return "portrait";
        }else{
            return "landscape";
        }
    }
}