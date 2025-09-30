package hw4;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int month = sc.nextInt();
        
        if (month == 2) {
            System.out.println(28);
        } else if (month < 8) {
            if (month % 2 == 0) {
                System.out.println(30);
            } else {
                System.out.println(31);
            }
        } else {
            if (month % 2 == 0 && month <= 12) {
                System.out.println(31);
            } else {
                System.out.println(30);
            } 
        }
    }
}