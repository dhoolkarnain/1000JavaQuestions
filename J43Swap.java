public class J43Swap {
    public static void main(String[] args) {
        int a = 34, b = 45;
        System.out.println(a + " " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);

    }
}
