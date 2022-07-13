public class J37BlankSquarePattern {
    public static void main(String[] args) {
        int n = 7;
        int i = n / 2;
        for (; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (j <= i || j > n - i)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println("");

        }
        for (; i <= n / 2; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i || j > n - i)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println("");

        }
    }
}
