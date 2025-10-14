package hw8;

public class Calculator {
    static void main() {
        System.out.println(calculate(10, 15, 20));
    }

    static String calculate(int num1, int num2, int num3) {
        num1 /= 5;
        num2 /= 5;
        num3 /= 5;
        return String.format("%d, %d, %d", num1, num2, num3);
    }
}