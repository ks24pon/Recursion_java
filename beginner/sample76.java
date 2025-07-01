import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

class Solution{
    public static double hoursToLose1KgByExercise(String exercise){
        // 関数を完成させてください
        double weight = 85.5;
        int calories1kg = 7700;

        return (Math.floor((7700 / ((returnMet(exercise) * 3.5 * weight / 200) * 60)) * 10)) / 10;
    }

    public static int returnMet(String exercise){
        if(exercise == "running") return 8;
        else if(exercise == "walking") return 3;
        else if(exercise == "tennis") return 5;
        else return 9;
    }
}