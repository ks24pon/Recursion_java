import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

class Solution{
    public static double distanceToOrigin(int x, int y){
        double dx = x;
        double dy = y;
        return Math.sqrt(dx*dx +dy*dy);
    }
}