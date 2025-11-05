package ActivityChapter3;

import java.util.Scanner;


public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter numbers only.");
            return;
        }
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter numbers only.");
            return;
        }
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter numbers only.");
            return;
        }
        int num3 = sc.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest");
        } else {
            System.out.println(num3 + " is the largest");
        }
        sc.close();
    }
}




