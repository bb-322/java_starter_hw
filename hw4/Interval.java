package hw4;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        if (num >= 0 && num <= 14) {
            System.out.println("Interval [0-14]");
        } else if (num >= 15 && num <= 35) {
            System.out.println("Interval [15-35]");
        } else if (num >= 36 && num <= 50) {
            System.out.println("Interval [36-50]");
        } else if (num >= 51 && num <= 100) {
            System.out.println("Interval [51-100]");
        } else {
            System.out.println("Not in any interval");
        }

    }
}
