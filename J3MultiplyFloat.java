import java.util.*;
public class J3MultiplyFloat{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number");
        float f1=s.nextFloat();
        System.out.println("Enter second number");
        
        float f2=s.nextFloat();

        float mult=f1*f2;
        System.out.println(mult);
        s.close();

    }
}