public class J21NumberOfDigits {
    public static void main(String[] args) {
        int n = 1276309;
        int count = 0;
        do {
            n = n / 10;
            count++;

        } while (n != 0);
        System.out.println(count);
    }

}
