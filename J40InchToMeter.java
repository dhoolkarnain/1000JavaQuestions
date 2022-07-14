import java.util.*;

public class J40InchToMeter {
    public static void main(String[] args) {
        System.out.println("Enter reading in inch.");
        Scanner s = new Scanner(System.in);
        long inch = s.nextLong();
        System.out.println("Reading in meter = " + 0.0254 * inch);
        s.close();
    }
}
