public class J26PrimeBetween {
    public static void main(String[] args) {
        int min = 10, max = 100;
        for (int i = min; i <= max; i++) {
            int count = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                    count++;

            }
            if (count == 1)
                System.out.println(i);

        }
    }
}
