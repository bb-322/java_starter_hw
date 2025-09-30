package hw4;
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        int operand1 = 5, operand2 = 8;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arithmetic sign: ");
        char sign = sc.nextLine().charAt(0);

        switch (sign) {
            case '+':
                System.out.println(operand1 + operand2);
                break;
            case '-':
                System.out.println(operand1 - operand2);
                break;
            case '*':
                System.out.println(operand1 * operand2);
                break;
            case '/':
                if (operand2 != 0) {
                    System.out.println((float) operand1 / operand2);
                    break;
                } else {
                    System.out.println("Can't divide by 0");
                    break;
                }
            default:
                System.out.println("Unknown sign");
        }
    }
}