package hw8;

public class Avg345 {
    static void main() {
        System.out.println(avg(2, 6, 9));
        System.out.println(avg(1, 2, 3, 4));
        System.out.println(avg(2, 4, 6, 8, 10));
    }

    static float avg(int num1, int num2, int num3) {
        return ((num1 + num2 + num3) / 3f);
    }

    static float avg(int num1, int num2, int num3, int num4) {
        return ((num1 + num2 + num3 + num4) / 4f);
    }

    static float avg(int num1, int num2, int num3, int num4, int num5) {
        return ((num1 + num2 + num3 + num4 + num5) / 5f);
    }
}