package hw5;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        if ((num & 0b1) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}