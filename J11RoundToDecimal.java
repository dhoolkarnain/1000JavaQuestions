import java.math.RoundingMode;
import java.math.BigDecimal;

public class J11RoundToDecimal {
    public static void main(String[] args) {
        float num = 274.496f;
        int n = 4;
        BigDecimal bd = new BigDecimal(Double.toString(num));
        System.out.println(bd.setScale(n, RoundingMode.HALF_UP));
    }

}
