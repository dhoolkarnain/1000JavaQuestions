public class J22Reverse {
    public static void main(String[] args) {
        int n = 83547;
        int rev = 0;
        do {
            int r = n % 10;
            rev = rev * 10 + r;

            n = n / 10;
        } while (n != 0);
        System.out.println(rev);
    }
}
