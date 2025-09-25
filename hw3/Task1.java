package hw3;

public class Task1 {
    public static void main(String[] args) {
        int x = 10, y = 20, z = 30;
        x += y - x++ * z;
        z = --x - y * 5;
        y /= x + 5 % z;
        z = x++ + y * 5;
        x = y - x++ * z;
        System.out.printf("x = %d%ny = %d%nz = %d%n", x, y, z);
    }
}