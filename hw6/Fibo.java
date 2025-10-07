package hw6;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("enter num2: ");
        int num2 = sc.nextInt();

        for (int i = 1, n = 1, x = 1; i <= num2; x = (i + n), n = i, i = x) {
            if (x >= num1) {
                System.out.println(x);
            }
        }
    }
}
