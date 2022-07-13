public class J25Prime {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                count++;

        }
        if (count > 1)
            System.out.println("is Not Prime");
        else
            System.out.println("is Prime");

    }
}
