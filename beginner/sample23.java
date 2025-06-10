class Solution {
    public static String getBootstrapClass(int screenWidth) {
        if (screenWidth >= 1200) {
            return "lg";
        } else if (screenWidth >= 992) {
            return "md";
        } else if (screenWidth >= 768) {
            return "sm";
        } else {
            return "xs";
        }
    }
}
