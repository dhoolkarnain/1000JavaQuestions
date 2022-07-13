public class J8LargestAmongThree {
    public static void main(String[] args) {
        int a = 8, b = 9, c = 3, max = 0;
        if (a > b && a > c) {
            max = a;
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        System.out.println("Maximum is " + max);
    }
}