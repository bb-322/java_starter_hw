package hw6;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int result = 0;
        if (num1 < num2) {
            while (num1 <= num2) {
                result += num1;
                num1++;
            }
            System.out.print(result);
        } else {
            System.out.println("num1 must be lower than num2");
        }
    }
}
