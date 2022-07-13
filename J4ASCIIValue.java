import java.util.*;

public class J4ASCIIValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character");

        char c = s.next().charAt(0);
        System.out.println((int) c);
        s.close();
    }

}
