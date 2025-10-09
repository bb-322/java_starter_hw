package hw7;

import java.util.*;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the amount of money: ");
            String input = sc.nextLine().replace(',', '.'); // to be able to put both ',' and '.' in the float number
            float amount = Float.parseFloat(input);                         // parse string to float
            System.out.println("Choose operation\n1 - UAH to USD\n2 - USD to UAH");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println((Math.round(uahToUsd(amount) * 100) / 100f) + " USD");
                    break;
                case 2:
                    System.out.println(usdToUah(op) + " UAH");
                    break; 
                default:
                    System.out.println("Unknown operation");
            }
            sc.nextLine();
        }
    }

    static float uahToUsd(float num1) {
        return (float) (num1 / 41.54);
    }

    static float usdToUah(float num1) {
        return (float) (num1 * 41.54);
    }
}
