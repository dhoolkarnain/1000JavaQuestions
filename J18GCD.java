public class J18GCD {
    public static void main(String[] args) {
        int a = 45, b = 100;
        int gcd = 1;
        for (int i = 1; i < (a < b ? a : b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;

            }

        }
        System.out.println(gcd);
    }
}
