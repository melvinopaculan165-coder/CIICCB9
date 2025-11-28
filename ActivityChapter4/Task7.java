package ActivityChapter4;
import java.util.Scanner;

public class Task7 {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero. Returning 0.");
            return 0; // Or you could throw an exception
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Basic Arithmetic Operations Program ---");
        System.out.print("Enter the first number : ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.close();
        
        double sum = add(number1, number2);
        System.out.println("\nAddition: " + number1 + " + " + number2 + " = " + sum);
        double difference = subtract(number1, number2);
        System.out.println("Subtraction: " + number1 + " - " + number2 + " = " + difference);
        double product = multiply(number1, number2);
        System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + product);
        double quotient = divide(number1, number2);
        System.out.println("Division: " + number1 + " / " + number2 + " = " + quotient);
    }
}
