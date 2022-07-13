import java.util.*;

public class J35PascalTriangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter base");
        int base = s.nextInt();
        System.out.print("Enter Height");
        int height = s.nextInt();
        for (int i = 0; i < height; i++) {
            int j = 0;
            for (; j < height; j++) {
                if (j >= (height - i))
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            for (; j < base; j++) {
                if (j <= (height + i))
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println("");
        }
        s.close();
    }
}
