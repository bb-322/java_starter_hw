package hw8;

import java.util.Scanner;

public class Bank {
    static Scanner sc = new Scanner(System.in);
    static int loan = 700;
    static int loan_counter = 0;

    static void main() {
        do {
            loan_counter += pay();
        } while (loan_counter < loan);
        System.out.println("loan is paid");
    }

    static int pay() {
        System.out.println("loan: " + loan);
        System.out.println("loan counter: " + loan_counter);
        System.out.print("enter the amount: ");
        return sc.nextInt();
    }
}