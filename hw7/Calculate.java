package hw7;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("enter num2: ");
        int num2 = sc.nextInt();
        System.out.print("enter num3: ");
        int num3 = sc.nextInt();

        System.out.println("Average: " + avg(num1, num2, num3));
    }
    
    static float avg(int num1, int num2, int num3) {
        return Math.round(((float) (num1 + num2 + num3) / 3) * 100) / 100f;
    } 
}
