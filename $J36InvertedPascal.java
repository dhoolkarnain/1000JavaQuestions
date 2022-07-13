public class $J36InvertedPascal {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int j = 0;
            for (; j < 5; j++) {
                if (j >= (5 - i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (; j < 10; j++) {
                if (j <= (5 + i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
