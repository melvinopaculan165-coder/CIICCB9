package ActivityChapter4;
import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }
    public static float divide(int a, int b) {
        return (float) a / b;
    }
    public static void main(String[] args) {
        int num1 = 51;
        int num2 = 11;
        int num3 = 8;
        int num4 = 4;

        System.out.println("--- Math Operations using Static Import ---");
        System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
        System.out.println(num3 + " * " + num4 + " = " + multiply(num3, num4));
        System.out.println(num3 + " / " + num4 + " = " + divide(num3, num4));

    }
}
