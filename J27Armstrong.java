public class J27Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int m = n;
        int arm = 0;
        do {
            int r = n % 10;
            arm = arm + r * r * r;
            n = n / 10;
        } while (n != 0);
        if (m == arm)
            System.out.println("Armstrong");
        else
            System.out.println("not Armstrong");

    }
}
