package hw7;

public class Pow3 {
    public static void main(String[] args) {
        int num1 = 2, num2 = 3, num3 = 4, num4 = 5, num5 = 6;
        System.out.println(powerA3(num1));
        System.out.println(powerA3(num2));
        System.out.println(powerA3(num3));
        System.out.println(powerA3(num4));
        System.out.println(powerA3(num5));
    }

    static int powerA3(int num) {
        return (num * num * num);
    }
}
