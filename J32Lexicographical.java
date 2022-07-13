public class J32Lexicographical {
    public static void main(String[] args) {
        String[] a = { "ear", "Ball", "Cat", "Ant", "Dog" };
        // String temp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }

        }
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i] + " ");
    }
}
