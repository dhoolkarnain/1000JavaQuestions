public class J31ConsonentVowel {
    public static void main(String[] args) {
        String s = "a quick brown fox runs over the lazy dog";
        int count = 0, white = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A':
                    count++;
                    break;
                case 'E':
                    count++;
                    break;
                case 'I':
                    count++;
                    break;
                case 'O':
                    count++;
                    break;
                case 'U':
                    count++;
                    break;
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
                case ' ':
                    white++;
                    break;
            }
        }
        System.out.println("Vowel = " + count);
        System.out.println("Consonent = " + (s.length() - count - white));
    }
}
