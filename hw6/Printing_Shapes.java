package hw6;

public class Printing_Shapes {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int x = 0; x < 5; x++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        for (int i = 0; i < 8; i++) {
            System.out.println("* ".repeat(i));
        }
        System.out.println("--------------------------------");
        for (int a = 0, b = 12; a < 12 && b > 0; a++, b--) {
            System.out.println(" ".repeat(b) + "*".repeat(a).repeat(2));
        }
        System.out.println("--------------------------------");
        for (int a = 0, b = 12; a < 12 && b > 0; a++, b--) {
            System.out.println(" ".repeat(b) + "*".repeat(a).repeat(2));
        }
        for (int a = 0, b = 12; a < 12 && b > 0; a++, b--) {
            System.out.println(" ".repeat(a) + "*".repeat(b).repeat(2));
        }
    }
}
