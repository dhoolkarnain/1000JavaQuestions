public class J19LCM {
    public static void main(String[] args) {
        int a = 5, b = 12;
        int lcm = a * b;
        for (int i = a > b ? a : b; i > 0; i++) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;

            }

        }
        System.out.println(lcm);

    }

}
