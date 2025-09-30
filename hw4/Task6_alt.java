package hw4;
import java.util.Scanner;
public class Task6_alt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int min = Math.min(num1, Math.min(num2, num3));
        int max = Math.max(num1, Math.max(num2, num3));
        int middle = num1 + num2 + num3 - min - max;

        System.out.println("Min number: " + min);
        System.out.println("Middle number: " + middle);
        System.out.println("Max number: " + max);
    }
}
