public class J6SwapNumber {

    public static void main(String[] args) {
        int num1 = 56, num2 = 65;
        System.out.println("Before Swap");
        System.out.println(num1 + "  " + num2);
        int temp = num2;
        num2 = num1;
        num1 = temp;
        System.out.println("After Swap");
        System.out.println(num1 + "  " + num2);

    }

}
