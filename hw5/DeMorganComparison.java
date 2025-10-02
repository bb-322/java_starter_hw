package hw5;

public class DeMorganComparison {
    public static void main(String[] args) {
        int x = 10, y = 7;
        
        System.out.println(x | y);

        System.out.println(~(~x & ~y));
    }
}
