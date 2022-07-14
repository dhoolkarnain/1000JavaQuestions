public class J45Grade {
    public static void main(String[] args) {
        int marks = 45;
        if (marks >= 90)
            System.out.println("Grade : A+");
        else if (marks < 90 && marks >= 70)
            System.out.println("Grade : A");
        else if (marks < 70 && marks >= 35)
            System.out.println("Grade : C");
        else
            System.out.println("Grade : Fail");
    }
}
