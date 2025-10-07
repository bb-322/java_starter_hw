package hw6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter N: ");
        int n = sc.nextInt(), fact = 1;
        float result = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            result += (float) 1 / fact;
        }
        System.out.println(result);
    }
}
