import java.math.BigDecimal;
import java.math.RoundingMode;

// BigDecimal Operations
public class BigDecimalUtils {
    public static double roundToNearestHundredth(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal reverseSignAndRoundToTenth(BigDecimal number) {
        return number.negate().setScale(1, RoundingMode.HALF_UP);
    }
}