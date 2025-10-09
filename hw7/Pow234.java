package hw7;

public class Pow234 {
    public static void main(String[] args) {
        int num1 = 2, num2 = 3, num3 = 4, num4 = 5, num5 = 6;
        System.out.println(powerA234(num1));
        System.out.println(powerA234(num2));
        System.out.println(powerA234(num3));
        System.out.println(powerA234(num4));
        System.out.println(powerA234(num5));
    }

    static String powerA234(int num) {
        int pw2 = num*num, pw3 = num*num*num, pw4 = num*num*num*num;
        return String.format("Number %d: \n\tpower 2: %d\n\tpower 3: %d\n\tpower 4: %d", num, pw2, pw3, pw4);
    }
}
