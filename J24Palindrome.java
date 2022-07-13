public class J24Palindrome {
    public static void main(String[] args) {
        int n = 3546;
        int m = n;
        int rev = 0;
        do {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;

        } while (n != 0);
        if (rev == m) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("is Not Palindrome");
        }
    }
}
