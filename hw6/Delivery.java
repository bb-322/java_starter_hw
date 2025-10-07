package hw6;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the amount of clients: ");
        int n = sc.nextInt();
        int result = 1;
        do {
            result *= n--;
        } while (n > 1);
        System.out.println(result);
    }
}
