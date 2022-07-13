public class J12EmptyNull {
    public static void main(String[] args) {
        String s = "";
        if (s.equals(null)) {
            System.out.println("Null");
        } else if (s.length() == 0) {
            System.out.println("Empty");
        } else {
            System.out.println("neither empty nor null");
        }
    }

}
