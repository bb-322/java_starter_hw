package hw9;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class CustomerArray {
    static void main() {
        int sum = 0;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        int[] odd = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = r.nextInt(100);
        }

        System.out.print("array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("max: " + Arrays.stream(array).max().getAsInt());
        System.out.println("min: " + Arrays.stream(array).min().getAsInt());

        for (int i : array) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        System.out.println("Average: " + (sum / array.length));

        int index_odd = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                odd[index_odd++] = num;
            }
        }

        System.out.println("Odd numbers: ");
        for (int i : odd) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }


    }
}