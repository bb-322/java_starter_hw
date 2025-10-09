package hw7;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("number: ");
            int num = sc.nextInt();
            System.out.println("positive or negative: " + positiveOrNegative(num));
            System.out.println("is prime? " + isPrime(num));
            System.out.println(isDividedByNums(num));
        }
    }

    static String positiveOrNegative(int num) {
        if (num >= 0) {
            return "positive";
        } else {
            return "negative";
        }
    }

    static boolean isPrime(int num) {
        if (num < 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static String isDividedByNums(int num) {
        String n2 = "2: no", n3 = "3: no", n5 = "5: no", n6 = "6: no", n9 = "9: no";
        if (num % 2 == 0) {
            n2 = "2: yes";
        }
        if (num % 3 == 0) {
            n3 = "3: yes";
        }
        if (num % 5 == 0) {
            n5 = "5: yes";
        }
        if (num % 6 == 0) {
            n6 = "6: yes";
        }
        if (num % 9 == 0) {
            n9 = "9: yes";
        }

        return String.format("Number can be divided by:\n\t%s\n\t%s\n\t%s\n\t%s\n\t%s", n2, n3, n5, n6, n9);
    }

}
