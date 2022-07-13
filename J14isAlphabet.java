public class J14isAlphabet {
    public static void main(String[] args) {
        char c = 'A';
        if ((int) c <= 65 && (int) c >= 90 && (int) c <= 122 && (int) c >= 97) {
            System.out.println(c + "is Alphabet");
        } else {
            System.out.println(c + "is not Alphabet");
        }
    }

}
