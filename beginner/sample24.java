class Solution{
    public static boolean isThereSchool(String day, boolean isHoliday){
        boolean isSatOrSun = day.equals("Saturday") || day.equals("Sunday");
        return !(isSatOrSun || isHoliday);
    }
}