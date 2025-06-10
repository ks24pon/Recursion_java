import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

class Solution{
    public static double interestsPaid(int initialLoan, boolean didPayOnTime){
        // 支払われた場合の利子
        final double percentLate = 1.02;
        // 支払われなかった場合の利子
        final double percentDelay = 1.15;
        // 手数料
        final double surviceFee = 2.5;
        
        return (didPayOnTime)? initialLoan * percentLate + surviceFee: initialLoan * percentDelay + surviceFee;
    }
}

