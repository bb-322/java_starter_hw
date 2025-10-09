package hw7;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter num1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter num2: ");
            int num2 = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter operation. Choose from: add / sub / mult / div");
            String user_act = sc.nextLine();
            switch (user_act) {
                case "add":
                    System.out.println(add(num1, num2));
                    break;
                case "sub":
                    System.out.println(sub(num1, num2));
                    break;
                case "mult":
                    System.out.println(mult(num1, num2));
                    break;
                case "div":
                    System.out.println(div(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
    }
    
    static int add(int num1, int num2) {
        return num1+num2;
    }

    static int sub(int num1, int num2) {
        return num1-num2;
    }
    
    static int mult(int num1, int num2) {
        return num1*num2;
    }

    static float div(int num1, int num2) {
        if (num2 != 0) {
            return (float) num1 / num2;
        } else {
            System.out.println("Can't divide by 0");
            return 0;
        }
    }
}
