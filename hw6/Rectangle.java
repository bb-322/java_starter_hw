package hw6;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter height: ");
        int num1 = sc.nextInt();
        System.out.print("enter width: ");
        int num2 = sc.nextInt();
        for (int i = 0; i < num1; i++) {
            for (int x = 0; x < num2; x++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
