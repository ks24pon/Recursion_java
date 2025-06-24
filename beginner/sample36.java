import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

class Solution{
    public static String calculateLocation(double latitude, double longitude){
        // 関数を完成させてください
        String northOrSouth;
        String eastOrWest;

        if(latitude == 0) northOrSouth = "equator";
        else if(latitude < 0) northOrSouth = "south";
        else northOrSouth = "north";

        if(latitude == 0) eastOrWest = "prime meridian";
        else if(longitude < 0) eastOrWest = "west";
        else eastOrWest = "east";

        return northOrSouth + "/" + eastOrWest;
    }
}

