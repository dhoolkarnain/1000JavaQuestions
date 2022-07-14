import java.util.*;

public class J38Product {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        a = s.nextInt();
        System.out.println("Enter second number");
        b = s.nextInt();

        System.out.println("Product = " + a * b);
        s.close();
    }
}
