public class J23PowerOfNumber {
    public static void main(String[] args) {
        int n = 8, f = 3;
        int pow = 1;

        for (int i = 1; i <= f; i++) {
            pow = pow * n;

        }
        System.out.println(pow);

    }
}
