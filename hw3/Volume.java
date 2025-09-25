package hw3;

public class Volume {
    public static void main(String[] args) {
        double PI = Math.PI;
        int r = 5;
        int h = 10;
        double v = PI * r * r * h;
        double s = 2 * PI * r * (r + h);
        System.out.println(v);
        System.out.println(s);
    }
}
