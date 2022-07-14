public class J42LeapYear {
    public static void main(String[] args) {
        int year = 2050;
        if (year % 4 == 0)
            System.out.println(year + " is Leap year");
        else
            System.out.println(year + " is not Leap year");
    }
}
