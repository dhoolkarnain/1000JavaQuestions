public class J41GreatOf3Num {
    public static void main(String[] args) {
        int a = 4, b = 5, c = 2;
        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        System.out.println("Maximum is " + max);
    }
}
