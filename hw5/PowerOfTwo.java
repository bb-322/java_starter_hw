package hw5;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();

        if ((num & (num - 1)) == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
