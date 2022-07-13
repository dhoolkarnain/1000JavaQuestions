public class J9FrequencyChar {
    public static void main(String[] args) {
        String s = "ijsdhdakjhkjhjkjakljkha";
        int count = 0;
        char c = 'k';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        System.out.println(c + " occurs " + count + " times");
    }

}
